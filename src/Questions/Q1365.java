package Questions;

public class Q1365 {
//	暴力解法
	public int[] smallerNumbersThanCurrent1(int[] nums) {
		int r = 0;
		int[] result = new int[nums.length];
		for(int i=0; i< nums.length; i++) {
			for(int j=0; j < nums.length; j++) {
				if(nums[i] >nums[j]) {
					r=r+1;
				}
			}
			result[i]=r;
			r=0;
		}
		return result;
    }
//	使用排序
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int r = 0;
        int[] result = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            for(int j=0; j < nums.length; j++) {
                if(nums[i] >nums[j]) {
                    r=r+1;
                }
            }
            result[i]=r;
            r=0;
        }
        return result;
    }
//	使用计数数组
	public int[] smallerNumbersThanCurrent3(int[] nums) {
		int count[] = new int[101];
		int result[] = new int[nums.length];
		for(int i=0; i< nums.length; i++) {
			count[nums[i]] = count[nums[i]]+1;
			}
		for(int i=0; i< nums.length; i++) {
			result[i] = lessCount(count,nums[i]);
		}
		return result;
		}
	
	public int lessCount(int[] nums, int i) {
		int r=0;
		for(int j=0;j<i+1;j++) {
			r=r+nums[j];
		}
		return r;
	}
// 	快速排序！！！
	public int findIndex(int[] nums,int low, int high){
		int l = low;
		int h = high;
		int key = nums[l];
	    while(l != h){
	    	if(nums[h]<key) {
	    		nums[l] = nums[h];
	    		while(l != h){
	    			if(nums[l] > key){
	    				nums[h] = key;
	    				break;
					} else{
	    				l = l+1;
					}
				}
			} else {
	    		h = h -1;
			}
		}
	    return l;
    }
    public void quickSort(int[] nums, int low, int high){
		int index = findIndex(nums,low,high);
		quickSort(nums,low,index);
		quickSort(nums,index+1,high);
	}
}