package Questions.Q300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q242{
    public boolean isAnagram3(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int length = s.length();

        int[] record = new int[26];

        for(int i = 0; i < length; i++){
            record[s.charAt(i) - 'a'] ++;
        }

        for(int i = 0; i < length; i++){
            record[t.charAt(i) - 'a'] --;
            if(record[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram2(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }
    public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int length = s.length();
        char[] sChar = new char[length];
        char[] tChar = new char[length];

        for(int i = 0; i<length; i++){
            sChar[i] = s.charAt(i);
            tChar[i] = t.charAt(i);
        }
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for(int i = 0; i < length; i++){
            if(sChar[i] != tChar[i]){
                return false;
            }
        }

        return true;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character,Integer> sRecord = new HashMap<>();

        for(int i = 0; i<s.length();i++){
            if(sRecord.containsKey(s.charAt(i))){
                int tmp = sRecord.get(s.charAt(i));
                tmp ++;
                sRecord.put(s.charAt(i), tmp);
            }else{
                sRecord.put(s.charAt(i),1);
            }
        }

        for(int i = 0; i<t.length(); i++){
            char key = t.charAt(i);
            if(!sRecord.containsKey(key) || sRecord.get(key) <= 0){
                return false;
            }
            if(sRecord.get(key) > 0){
                int tmp = sRecord.get(key);
                tmp--;
                sRecord.put(key, tmp);
            }
        }

        return true;
    }
}