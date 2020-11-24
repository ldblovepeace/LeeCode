package Questions.Q200;

public class Q189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        
        for(int i = 0; i<k ; i++) {
//            rotate k次
            int tmp = nums[n-1];
            for(int j = n-1; j >0 ; j--) {
//                每次都向右移动1位
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
    }
}
