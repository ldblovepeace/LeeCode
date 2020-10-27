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
    	       int[] result = new int[nums.length];
    	       int[] sort = nums.clone();
//    	       注意数组对象的克隆方法
    	       quickSort(sort,0,sort.length-1);
    	       for(int i=0; i<nums.length; i++){
    	           for(int j=0;j<sort.length;j++){
    	               if(nums[i]==sort[j]){
    	                   result[i] = j;
    	                   break;
    	               }
    	           }
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
//	    	从后往前遍历
	    	if(nums[h]<key) {
//	    		如果发现h比key小，当前l位置字符设为h位置数字
	    		nums[l] = nums[h];
	    		l = l+1;
	    		while(l != h){
//	    			完成替换后，从前往后遍历
	    			if(nums[l] > key){
//	    				发现l位置比key大，将当前h位置字符设置为l位置数字
	    				nums[h] = nums[l];
	    				h = h-1;
	    				break;
					} else{
	    				l = l+1;
					}
				}
	    	}
	    	else {
	    		h = h-1;
			}
		}
	    nums[l] = key;
	    return l;
    }
    public void quickSort(int[] nums, int low, int high){
    	if(low < high) {
//    		根据此条件推退出递归
			int index = findIndex(nums,low,high);
			quickSort(nums,low,index);
			quickSort(nums,index+1,high);
    	}
	}
}