package Questions.Q500;

public class Q453 {
	public int minMoves(int[] nums) {
//		n-1个加一等于1个减一
		int res = 0;
		int min = Integer.MAX_VALUE;
		int n = nums.length;
		
		for(int i = 0; i < n;i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			res = res + nums[i] - min;
		}
		
		
		return res;
    }
	
	public int minMoves2(int[] nums) {
		int min = Integer.MAX_VALUE;
		int n = nums.length;
		int sum = 0;
		for(int i = 0; i < n;i++) {
			sum = sum + nums[i];
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		return sum-min*n;
	}
	
//	数学题
//
//	假设目前数组总和为sum，我们需要移动次数为x，那么整体数组总和将会增加x * (n - 1)，这里的n为数组长度，最后数组所有元素都相等为max，于是有：
//
//	sum + x * (n - 1) = max * n
//
//	我们再设数组最小的元素为min，x = max - min​ 
//	关键点在于最小一定是每步都会增加，但是如果每次移动n-2个就不一定了，这个怎么处理？
//
//	x = sum - min * n​
}