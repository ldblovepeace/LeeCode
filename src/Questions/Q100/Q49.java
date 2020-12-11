package Questions.Q100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        时间复杂度过高
        List<List<String>> res = new ArrayList<>();
        int n = strs.length;
        int[] record = new int[n];
        
        for(int i=0; i<n; i++) {
            List<String> l = new ArrayList<>();
            
            if(record[i] == 0) {
                l.add(strs[i]);
            }else {
                continue;
            }
            
            for(int j=i+1; j<n; j++) {
                while(j<n && record[j] == 1) {
                    j++;
                }
                if(j == n) {
                    break;
                }else {
                    if(isAnagram(strs[i],strs[j])) {
                        l.add(strs[j]);
                        record[j] = 1;
                    }
                }
            }
            res.add(l);
        }
        
        return res;
    }
    
    public boolean isAnagram(String s1, String s2) {
        int[] record = new int[26];
        if(s1.length() != s2.length()) {
            return false;
        }
        for(int i=0; i<s1.length(); i++) {
            record[s1.charAt(i)-'a'] ++;
            record[s2.charAt(i)-'a'] --;
        }
        for(int i=0; i<26; i++) {
            if(record[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public List<List<String>> groupAnagrams1(String[] strs){
//        时间复杂度很高
        List<List<String>> res = new ArrayList<>();
        int n = strs.length;
        int[][] record = new int[n][26];
        for(int i=0; i<n; i++) {
            int s = strs[i].length();
            for(int j=0; j<s; j++) {
                record[i][strs[i].charAt(j) - 'a']++;
            }
        }
        
        int[] r = new int[n];
        for(int i=0; i<n; i++) {
            List<String> l = new ArrayList<>();
            if(r[i] == 0) {
                l.add(strs[i]);
            }else {
                continue;
            }
            
            for(int j=i+1; j<n; j++) {
                if(Arrays.equals(record[i], record[j])) {
                    l.add(strs[j]);
                    r[j] = 1;
                }
            }
            res.add(l);
        }
        
        return res;
    }
    
    public List<List<String>> groupAnagrams2(String[] strs){
//        时间复杂度很高
        List<List<String>> res = new ArrayList<>();
        int n = strs.length;
        
        for(int i=0; i<n; i++) {
            List<String> l = new ArrayList<>();
            boolean find = false;
            
            if(i == 0) {
                l.add(strs[i]);
                res.add(l);
                continue;
            }
            
            for(List<String> l1:res) {
                if(isAnagram(strs[i],l1.get(0))) {
                    l1.add(strs[i]);
                    find = true;
                    break;
                }
            }
            if(!find) {
                List<String> l2 = new ArrayList<>();
                l2.add(strs[i]);
                res.add(l2);
            }

        }
        
        return res;
    }
    
    class Solution {
        public List<List<String>> groupAnagrams3(String[] strs) {
            HashMap<String,ArrayList<String>> map=new HashMap<>();
            for(String s:strs){
                char[] ch=s.toCharArray();
                Arrays.sort(ch);
                String key=String.valueOf(ch);
                if(!map.containsKey(key))    map.put(key,new ArrayList<>());
                map.get(key).add(s);
            }
            return new ArrayList(map.values());
        }
    }
}
