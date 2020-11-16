package Questions;

public class Q406 {
	public int[][] reconstructQueue(int[][] people) {
		int[][] result = people.clone();
		fastSort(result,0,result.length-1);
//		按第一列进行排序
		int[][] record = new int[result.length][2];
//		记录排序状态，将排序的第一列放入record
		for(int i = 0; i< people.length; i++) {
			int j = result[i][1];
			for(int q = 0; q<= j;q++) {
				if(record[q][0]!=0 && record[q][1] < result[i][0]) {
//					如果已排序表比对应位置大则加一
					j = j+1;
				}
//			j为对应行位置
			}
			people[j] = result[i];
			record[j][1] = result[i][0];
			record[j][0] = 1;
		}
		return people;
    }
	
	public void fastSort(int[][] num, int front,int rear) {
//		根据二维数组第一列大小排序
		if(front < rear) {
			int index = findIndex(num,front,rear);
			fastSort(num,front,index);
			fastSort(num,index+1,rear);
		}
	}
	
	
	public int findIndex(int[][] num, int front, int rear) {
		int key = num[front][0];
		while(front!=rear) {
			if(num[rear][0] < key) {
				int[] tmp = num[front];
				num[front] = num[rear];
				num[rear] = tmp;
				while(front!=rear) {
					if(num[front][0] > key) {
						tmp = num[front];
						num[front] = num[rear];
						num[rear] = tmp;
						break;
					} else {
						front ++;
					}
				}
			}else{
				rear --;
			}
		}
		return front;
	}
}
