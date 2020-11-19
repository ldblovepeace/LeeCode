package Questions.Q300;

public class Q283 {
	public void moveZeroes(int[] nums) {
		
		int zeroNum = 0;
		
        for(int i = nums.length-1; i>=0 ; i--) {
        	if(nums[i] == 0) {
        		for(int j = i; j<nums.length-1-zeroNum ; j++) {
            		int tmp = nums[j];
            		nums[j] = nums[j+1];
            		nums[j+1] = tmp;
            	}
        		zeroNum++;
        	}
        }
    }
	
	public void moveZeroes2(int[] nums) {
		int notZeroNum = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]!=0) {
				nums[notZeroNum] = nums[i];
				notZeroNum ++;
			}
		}
		
		for(int i = notZeroNum; i< nums.length;i++) {
			nums[i] = 0;
		}
    }
}
