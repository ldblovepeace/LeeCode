package Questions;

public class Q414 {
	public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i< nums.length;i++){
        	int tempMax = max;
        	int tempSecondMax = secondMax;
        	int tempThirdMax = thirdMax;
        	
        	if(nums[i] <= min) {
        		min = nums[i];
        	}
        	
        	if(nums[i] > tempMax) {
        		thirdMax = secondMax;
        		secondMax = max;
        		max = nums[i];
        	}
        	
        	if(nums[i] < tempMax && nums[i] > tempSecondMax) {
        		thirdMax = secondMax;
        		secondMax = nums[i];
        	}
        	
        	if(nums[i] < tempSecondMax && nums[i] >= tempThirdMax) {
        		thirdMax = nums[i];
        	}
        }

        if(thirdMax>=min && secondMax > thirdMax){
            return thirdMax;
        }else{
            return max;
        }
    }
}
