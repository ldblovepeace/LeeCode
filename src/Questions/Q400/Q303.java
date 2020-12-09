package Questions.Q400;

public class Q303 {
    private int[] n;
    private int[] sum;
    
    public Q303(int[] nums) {
        n = nums.clone();
        sum = new int[nums.length];
        if(nums.length == 0) {
            return;
        }
        sum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
//        int sum = 0;
//        for(;i<j+1;i++) {
//            sum = sum + n[i];
//        }
//        return sum;
        if(i == 0) {
            return sum[j];
        }else {
            return sum[j] - sum[i-1];
        }
    }
}
