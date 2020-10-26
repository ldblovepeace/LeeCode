package Questions;

public class Q1365 {
//	�����ⷨ��ֱ�Ӵ�ͷ��β����
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
//	����
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
//	����
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
	public int[] fastSort(int[] nums){
		int low= 0;
		int high=nums.length-1;
		int key = nums[low];
	    int[] result = new int[nums.length];
	    return result;
    }
}