package Questions.Q400;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for(int i=0; i<magazine.length(); i++) {
            record[magazine.charAt(i)-'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++) {
            if(record[ransomNote.charAt(i)-'a'] == 0) {
                return false;
            }
            record[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}
