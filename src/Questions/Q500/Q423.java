package Questions.Q500;

import java.util.Arrays;

public class Q423 {
    public String originalDigits(String s) {
        String[] nums = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int[] records = new int[26];
        for(int i=0; i<n; i++) {
            records[s.charAt(i)-'a']++;
        }
        
        int[] res = new int[10];
        
        res[0] = records['z'-'a'];
        res[2] = records['w'-'a'];
        res[4] = records['u'-'a'];
        res[6] = records['x'-'a'];
        res[8] = records['g'-'a'];
        res[3] = records['h'-'a'] - res[8];
        res[7] = records['s'-'a'] - res[6];
        res[5] = records['f'-'a'] - res[4];
        res[1] = records['o'-'a'] - res[0] - res[2] - res[4];
        res[9] = (records['n'-'a'] - res[1] - res[7])/2;
        
        for(int i=0; i<10; i++) {
            while(res[i] > 0) {
                sb.append(i);
                res[i]--;
            }
        }
        
        return sb.toString();
    }
}
