package Questions.Q300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q204 {
    public int countPrimes(int n) {
        List<Integer> primeList = new ArrayList<>();
        if(n<=2) {
            return 0;
        }
        primeList.add(2);
        for(int i = 3; i<n; i++) {
            boolean isPrime = true;
            for(int j:primeList) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primeList.add(i);
            }
        }
        
        return primeList.size();
    }
    public int countPrimes1(int n) {
        int[] nums = new int[n];
        if(n<=2) {
            return 0;
        }
        Arrays.fill(nums, 1);
        int res = 0;
        for(int i = 2; i < n; i++) {
            if(nums[i] == 1) {
                res++;
                for(int j = i+i; j<n; j = i+j) {
                    nums[j] = 0;
                }
            }
        }
        
        
        return res;
    }
}
