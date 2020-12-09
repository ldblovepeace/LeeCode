package Questions.Q600;

public class Q520 {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(n == 0) {
            return true;
        }
        char c = word.charAt(0);
        if(c - 'a' < 0) {
            String tmp = word.substring(1,n);
            if(tmp.equals(tmp.toUpperCase()) || tmp.equals(tmp.toLowerCase())) {
                return true;
            }else {
                return false;
            }
        }
        else {
            String tmp = word.substring(1,n);
            if(tmp.equals(tmp.toLowerCase())) {
                return true;
            }else {
                return false;
            }
        }
    }
}
