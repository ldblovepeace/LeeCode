package Questions.Q400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Q316 {

    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] record = new int[26];
        int[] filled = new int[26];
        for(int i=0; i<n; i++) {
            record[s.charAt(i) - 'a']++;
        }
        Stack<Character> res = new Stack<>();
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(filled[c - 'a'] == 0) {
//          如果当前字符没有存储过
                while(!res.isEmpty()  && res.peek() > c &&  record[res.peek() - 'a'] > 0) {
//                  判断栈顶值比当前值大，且后续有与栈顶相同的字符，那么栈顶弹出，记录是否保存的置为0
                  filled[res.pop() - 'a'] = 0;
                }
//            退出循环代表，当前栈顶比后一个字符小，或者后续没有相同的字符
                res.push(c);
                filled[c - 'a'] = 1;
            
            }
            record[c - 'a']--;
        }
        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()) {
            sb.append(res.pop());
        }
        return sb.reverse().toString();
    }
    

    public String removeDuplicateLetters1(String s) {
//        做的不对
        int n = s.length();
        List<List<Integer>> record = new ArrayList<List<Integer>>();
        for(int i=0; i<26; i++) {
            List<Integer> l = new ArrayList<>();
            record.add(l);
        }
        for(int i=0; i<n; i++) {
            int tmp = s.charAt(i) - 'a';
            record.get(tmp).add(i);
        }
        
        int[][] res = new int[26][2];
        
        for(int i=0; i<26; i++) {
            res[i][0] = i;
            if(record.get(i).size() != 0) {
                List<Integer> l = record.get(i);
                for(int j=0; j<l.size(); j++) {
                    boolean find = true;
                    for(int k=0; k<i; k++) {
                        if(res[k][1] > l.get(j)) {
                            find = false;
                            break;
                        }
                    }
                    if(!find && j<l.size()-1) {
                        continue;
                    }else {
                        res[i][1] = l.get(j);
                    }
                }
            }
        }
        
        Arrays.sort(res, new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o1[1] - o2[1];
            }
            
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<26; i++) {
            if(res[i][1] != 0) {
                sb.append((char)(res[i][0] + 'a'));
            }
        }
        
        return sb.toString();
    }
    
}
