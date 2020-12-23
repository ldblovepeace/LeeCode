package Questions.Q400;

public class Q392 {
    public boolean isSubsequence(String s, String t) {
        
        int start = 0;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            start = t.indexOf(c, start) + 1;
            if(start == 0) {
                return false;
            }
        }
        return true;
    }
}
