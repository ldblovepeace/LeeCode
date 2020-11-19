package Questions.Q500;

public class Q495 {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
        int durationTotal = 0;
		int length = timeSeries.length;
		int attackStart = 0;

		while(attackStart<length) {
			if(attackStart == length-1) {
				//边界条件，如果是最后一次攻击，直接增加duration，返回结果
				durationTotal = durationTotal + duration;
				break;
			}else {
				int attackEnd = attackStart+1;
				while(attackEnd < length && timeSeries[attackEnd] - timeSeries[attackEnd-1] < duration ) {
//					如果下一次攻击一直在区间内攻击，不断增加
					attackEnd++;
				}
				durationTotal = durationTotal + timeSeries[attackEnd-1] - timeSeries[attackStart] + duration;
//				返回停止前一次与开始攻击的数值差，加上持续时间
				attackStart = attackEnd;
			}
		}
		
		return durationTotal;
    }
}
