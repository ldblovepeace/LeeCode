package Questions.Q200;

public class Q189 {
    public void rotate1(int[] nums, int k) {
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
    
    public void rotate2(int[] nums, int k) {
        int n = nums.length-1;
        k = k % n;
        
        if(k == 0) {
            return;
        }
        
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
    }
    
    public void reverse(int[] nums, int i, int j) {
        int tmp;
        if(i> nums.length-1 || j > nums.length-1 || i>=j) {
            return;
        }
        while(i<j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
    
//    public void rotate3(int[] nums, int k) {
//        int n=nums.length - 1;
//        k = k%n;
//        rotate(nums,k,0,n);
//    }
//    
//    public void rotate(int[] nums, int k, int start, int end) {
//        int n = end - start - 1;
//        if(n == 0) {
//            return;
//        }
//        if(n == 1) {
//            swap(nums, start, end);
//         }
//        
//        for(int i = start; i < k; i++) {
//            swap(nums, i , i+n-k);
//        }
//        
//        rotate(nums,k,n-k,n);
//        
//        k = k%n;
//    }
//    
//    public void swap(int[] nums, int i, int j) {
//        int tmp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = tmp;
//    }
}
