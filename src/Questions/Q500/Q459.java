package Questions.Q500;

public class Q459 {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1; i<=s.length()/2; i++) {
            if(s.length() % i == 0) {
                if(repeatedSubstringPattern(s, i)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean repeatedSubstringPattern(String s, int index) {
        String repeat = s.substring(0, index);
        for(int i = index; i<s.length(); i += index) {
            if(i+index > s.length()) {
                return false;
            }
            String compare = s.substring(i,i+index);
            if(!compare.equals(repeat)) {
                return false;
            }
        }
        return true;
    }
}
