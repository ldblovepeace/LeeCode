package Questions;

public class Q41 {
	 public int firstMissingPositive(int[] nums) {
		 int max = Integer.MAX_VALUE;
	        int i = 1;
//	         空间复杂度O(n)不符合要求
	        while(i<max){
	        	boolean found = false;
	            for(int j = 0; j < nums.length;j++){
	                if(nums[j]==i){
	                    i++;
	                    found = true;
	                    break;
	                }
	            }
	            if(!found) {
	            	return i;
	            }
	        }
	        return i;
	 }
	 
	 public int firstMissingPositive2(int[] nums) {
//	        空间复杂度O(n)不符合要求

	     int[] record = new int[nums.length+1];
	     for(int i = 0; i < nums.length;i++) {
	    	 if(nums[i] < record.length && nums[i] > 0) {
	    		 record[nums[i]] = 1;
	    	 }
	     }
	     for(int i = 1; i<record.length;i++) {
	    	 if(record[i] == 0) {
	    		 return i;
	    	 }
	     }
	     return nums.length+1;
	 }
	 
	 public int firstMissingPositive3(int[] nums) {
// 符合要求，但是太难想了。。。
	     for(int i = 0; i < nums.length;i++) {
	    	 if(nums[i] > nums.length || nums[i] <= 0) {
	    		 nums[i] = nums.length+1; 
	    	 }
	     }
	     for(int i = 0; i<nums.length;i++) {
	    	 if(Math.abs(nums[i]) != nums.length+1) {
	    		 nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
	    	 }
	     }
	     for(int i = 0; i<nums.length;i++) {
	    	 if(nums[i] > 0) {
	    		 return i+1;
	    	 }
	     }
	     return nums.length+1;
	 }
}
