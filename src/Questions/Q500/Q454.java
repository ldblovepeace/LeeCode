package Questions.Q500;

import java.util.HashMap;
import java.util.Map;

public class Q454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
//        Arrays.sort(D);
        for(int i = 0; i<A.length; i++) {
            for(int j = 0; j<B.length; j++) {
                for(int k = 0; k<C.length; k++) {
                    for(int l = 0; l<D.length; l++) {
                        if(A[i] + B[j] + C[k] + D[l] == 0) {
                            res++;
                        }
                    }
                }
            }
        }
        
        return res;
    }
    
    public int fourSumCount1(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        int n = A.length;
        Map<Integer, Integer> record = new HashMap<>();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                int sum = A[i] + B[j];
                if(record.containsKey(sum)) {
                    int val = record.get(sum);
                    val++;
                    record.put(sum, val);
                }else {
                    record.put(sum, 1);
                }
            }
        }
        
        for(int k = 0; k<n; k++) {
            for(int l=0; l<n; l++) {
                int sum = -C[k] - D[l];
                if(record.containsKey(sum)) {
                    int val = record.get(sum);
                    res = res + val;
                }
            }
        }
        
        return res;
    }
}
