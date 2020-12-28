package Questions.Q300;

import java.util.HashMap;
import java.util.Map;

public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(t.length() != n) {
            return false;
        }
        
        Map<Character, Character> r1 = new HashMap<Character, Character>();
        Map<Character, Character> r2 = new HashMap<Character, Character>();

        for(int i=0; i<n; i++) {
            char key = s.charAt(i);
            char val = t.charAt(i);
            if(r1.containsKey(key) && r1.get(key) != val) {
                return false;
            }
            if(r2.containsKey(val) && r2.get(val) != key) {
                return false;
            }
            if(!r1.containsKey(key)) {
                r1.put(key, val);
                r2.put(val, key);
            }
        }
        
        return true;
    }
}
