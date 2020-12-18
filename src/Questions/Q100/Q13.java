package Questions.Q100;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public int romanToInt(String s) {
        Map<Character, Integer> MAP = new HashMap<Character, Integer>();
        MAP.put('I',1);
        MAP.put('V',5);
        MAP.put('X',10);
        MAP.put('L',50);
        MAP.put('C',100);
        MAP.put('D',500);
        MAP.put('M',1000);

        char[] c = s.toCharArray();
        int n = c.length;
        int res = 0;
        
        if(n == 1) {
            return MAP.get(c[0]);
        }
        
        for(int i=0; i<n-1; i++) {
            int left = MAP.get(c[i]);
            int right = MAP.get(c[i+1]);
            if(left < right) {
                res = res - left + right;
                i++;
                if(i == n-2) {
                    res = res + MAP.get(c[n-1]);;
                }
            }else {
                res = res + left;
                if(i == n-2) {
                    res = res + right;
                }
            }
        }
        
        return res;
    }
}
