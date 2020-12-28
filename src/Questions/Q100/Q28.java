package Questions.Q100;

public class Q28 {  
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        if(n == 0) {
            return 0;
        }
        for(int i=0; i <= haystack.length()-n; i++) {
            if(haystack.substring(i, i+n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
