package Questions.Q300;

import java.util.HashMap;
import java.util.Map;

public class Q290 {
    public boolean wordPattern(String pattern, String s) {
        char[] c = pattern.toCharArray();
        String[] strs = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if(c.length != strs.length) {
            return false;
        }
        for(int i=0; i<c.length; i++) {
            if(map.containsKey(c[i])) {
                if(!map.get(c[i]).equals(strs[i])) {
                    return false;
                }
            }else {
                if(map.containsValue(strs[i])) {
                    return false;
                }
                map.put(c[i], strs[i]);
            }
        }
        return true;
    }
}
