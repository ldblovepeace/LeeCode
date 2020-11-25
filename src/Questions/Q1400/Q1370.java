package Questions.Q1400;

public class Q1370 {
    public String sortString(String s) {
        int[] record = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        
        int n = s.length();
        while(n>0) {
            for(int i = 0; i<26; i++) {
                if(record[i] != 0) {
                    sb.append((char)('a' + i));
                    record[i] --;
                    n--;
                }
            }
            for(int i = 25; i>=0 ;i--) {
                if(record[i]!=0) {
                    sb.append((char)('a' + i));
                    record[i]--;
                    n--;
                }
            }
        }
        
        String res = sb.toString();
        return res;
    }
}
