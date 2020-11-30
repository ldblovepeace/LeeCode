package Questions.Q1000;

import java.util.Arrays;

public class Q976 {
    public int largestPerimeter(int[] A) {
        int res = 0;
        Arrays.sort(A);
        int n = A.length;
        if(n<3) {
            return 0;
        }
        for(int i=n-1,j=n-2,k=n-3; k>=0; i--,j--,k--) {
            if(A[j]+A[k] >= A[i]) {
                res = A[i]+A[j]+A[k];
                break;
            }
        }
        return res;
    }
}
