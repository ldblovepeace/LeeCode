package Questions.Q400;

public class Q396 {
    public int maxRotateFunction(int[] A) {
        
        if(A.length == 0 || A.length == 1) {
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        int n = A.length;
        for(int k = 0; k < n; k++) {
            int res = 0;
            for(int i = 0; i < k; i++) {
                res = res + A[n+1-k+i] * i;
            }
            for(int i = k; i < n; i++) {
                res = res + A[i-k] * i;
            }
            if(res > max) {
                max = res;
            }
        }
        
        return max;
    }
    
    public int maxRotateFunction2(int[] A) {
        int n = A.length;
        if(n == 0 || n ==1) {
            return 0;
        }
        
        int res = 0;
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            res = res + i*A[i];
            sum = sum + A[i];
        }
        
        int res1 = res;
        
        for(int k = 1; k < n; k++) {
            int tmpRes  = res1 + sum - n*A[n-k]; 
            res = res < tmpRes? tmpRes:res; 
            res1 = tmpRes;
        }
        
        return res;
    }
}
