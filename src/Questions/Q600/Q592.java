package Questions.Q600;

public class Q592 {
    public String fractionAddition(String expression) {
        String[] s = expression.split("/");
        int n = s.length - 1;
        int[] fenzi  = new int[n];
        int[] fenmu = new int[n];
        for(int i=0; i<n; i++) {
//            处理分子分母，存到对应位置
            if( i==0 ) {
                fenzi[i] = Integer.parseInt(s[i]);
            }else {
                fenzi[i] = Integer.parseInt(s[i].substring(Math.max(s[i].indexOf('-'), s[i].indexOf('+'))));
            }
            if(i == n-1) {
                fenmu[i] = Integer.parseInt(s[i+1]);
            }else {
                fenmu[i] = Integer.parseInt(s[i+1].substring(0,Math.max(s[i+1].indexOf('-'), s[i+1].indexOf('+'))));
            }
            
        }
        
        int finalFenmu = leastCommonMultiple(fenmu);
        int finalFenzi = 0;
        for(int i=0; i<n; i++) {
            finalFenzi = finalFenzi + fenzi[i]*finalFenmu/fenmu[i];
        }
        if(finalFenzi != 0) {
            int fenziFenmuBCD = biggestCommonDivide(Math.abs(finalFenzi),finalFenmu);
            finalFenmu = finalFenmu/fenziFenmuBCD;
            finalFenzi = finalFenzi/fenziFenmuBCD;
        }else {
            finalFenmu = 1;
        }

        return String.valueOf(finalFenzi) + "/" + String.valueOf(finalFenmu);
    }
    
    public int leastCommonMultiple(int[] nums) {
//        求数组的最小公倍数
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return nums[0];
        }
        else if(n == 2) {
//            两个数的最小公约数
            long res = nums[0]*nums[1];
            res = res/biggestCommonDivide(nums[0],nums[1]);
            return (int) res;
        }
        else {
            int[] left = new int[n/2];
            int[] right = new int[n-n/2];
            for(int i=0; i<n/2; i++) {
                left[i] = nums[i];
            }
            for(int i=n/2; i<n;i++) {
                right[i-n/2] = nums[i];
            }
            
            int leftcm = leastCommonMultiple(left);
            int rightcm = leastCommonMultiple(right);
            long res = leftcm*rightcm;
            res = res/biggestCommonDivide(leftcm,rightcm);
            return (int) res;
        }

    }

    public int biggestCommonDivide(int nums1, int nums2) {
//      求两个数的最大公约数
        int d=0;
        if(nums1 == 0 || nums2 == 0) {
            return 0;
        }
        if(nums1 <= nums2){
            d = nums2%nums1;
        }else {
            d = nums1%nums2;
        }
        if(d == 0) {
            return Math.min(nums1, nums2);
        }else {
            return biggestCommonDivide(d,Math.min(nums1, nums2));
        }
  }
}
