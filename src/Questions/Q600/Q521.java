package Questions.Q600;

public class Q521 {
    public int findLUSlength(String a, String b) {
        if(a.length() != b.length()) {
            return a.length() > b.length()? a.length() : b.length();
        }
        return a.equals(b)? -1 : a.length();
    }
}
