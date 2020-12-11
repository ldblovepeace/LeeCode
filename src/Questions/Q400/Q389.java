package Questions.Q400;

public class Q389 {
    public char findTheDifference(String s, String t) {
        int record[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            record[s.charAt(i)-'a'] ++;
        }
        for(int i=0; i<t.length(); i++) {
            record[t.charAt(i)-'a'] --;
        }
        for(int i=0; i<26; i++) {
            if(record[i] < 0) {
                return (char) (i+'a');
            }
        }
        return ' ';
    }
    public char findTheDifference1(String s, String t) {
        int r = 0;
        for(int i=0; i<s.length(); i++) {
            r += s.charAt(i);
            r -= t.charAt(i);
        }
        r = r-t.charAt(t.length()-1);
        
        return (char) ('a'-r);
    }
}
