package Questions.Q500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q467 {

    public int findSubstringInWraproundString(String p) {
        int len = p.length();
        if (len == 0) return 0;
        int[] map = new int[26];
        int dp = 0;
        int sum = 0;
        char[] arr = p.toCharArray();
        for (int i=0; i<len; i++) {
            char c = arr[i];
            if (i == 0 || (c-arr[i-1] -1)%26 == 0) {
                dp++;
            } else dp = 1;
            int cnt = map[c-'a'];
            if (dp > cnt) {
                sum += dp - cnt;
                map[c-'a'] = dp;
            }
        }
        return sum;
    }

    public int findSubstringInWraproundString1(String p) {
        int res = 0;
        char[] c = p.toCharArray();
        int n = p.length();
        List<Integer> l = new ArrayList<>();
        int length = 0;
        for(int i=0; i<n-1; i++) {
            if(c[i+1]-c[i] == 1 || (c[i+1] == 'a' && c[i] == 'z')) {
                length++;
            }else {
                l.add(length+1);
                length = 0;
            }
        }
        if(length != 0) {
            l.add(length+1);
        }
        
        for(int i:l) {
            while(i>0) {
                res = res + i;
                i--;
            }
        }
        
        return res;
    }
}
