package Questions.Q300;

public class Q238 {
    public int[] productExceptSelf(int[] nums) {
//        时间复杂度 n^2 空间复杂度1
        int n = nums.length;
        int[] output = new int[n];
        for(int i=0; i<n; i++) {
            int left = 1;
            int right = 1;
            for(int j=0; j<i; j++) {
                left = left*nums[j];
            }
            for(int j=i+1; j<n ;j++) {
                right = right*nums[j];
            }
            output[i] = left*right; 
        }
        return output;
    }
    public int[] productExceptSelf1(int[] nums) {
//      时间复杂度 n 空间复杂度n
      int n = nums.length;
      int[] output = new int[n];
      int[] left = new int[n];
      int[] right = new int[n];
      left[0] = 1;
      right[n-1] = 1;
      for(int i=1; i<n; i++) {
          left[i] = left[i-1]*nums[i-1];
      }
      for(int i=n-2; i>=0; i--) {
          right[i] = right[i+1]*nums[i+1];
      }
      for(int i=0; i<n; i++) {
          output[i] = left[i]*right[i];
      }
      return output;
  }
    public int[] productExceptSelf2(int[] nums) {
//      时间复杂度 n 空间复杂度1
      int n = nums.length;
      int[] output = new int[n];
      int left = 1;
      int right = 1;
//      output[0] = nums[0];
      for(int i=0; i<n; i++) {
          if(i>0) {
              left = left*nums[i-1];
          }
          output[i] = left;
      }
      for(int i=n-1; i>=0; i--) {
          if(i<n-1) {
              right = right*nums[i+1];
          }
          output[i] = right*output[i];
      }
      return output;
  }
}
