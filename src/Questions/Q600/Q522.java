package Questions.Q600;

import java.util.Arrays;
import java.util.Comparator;

public class Q522 {
    public int findLUSlength(String[] strs) {
        if(strs.length == 1) {
            return strs[0].length();
        }
        if(strs.length == 0) {
            return 0;
        }
        
        Arrays.sort(strs, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                if(o1.length() < o2.length()) {
                    return 1;
                }
                if(o1.length() > o2.length()) {
                    return -1;
                }
                if(o1.length() == o2.length()) {
                    for(int i=0; i<o1.length(); i++) {
                        if(o1.charAt(i) < o2.charAt(i)) {
                            return -1;
                        }
                        if(o1.charAt(i) > o2.charAt(i)) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        });
        
        
        for(int i=0; i<strs.length; i++) {
//            处理头部
            if(i == 0) {
                if(!isLUS(strs[i+1],strs[i])) {
                    return strs[i].length();
                }
                continue;
            }
//            处理尾部
            if(i == strs.length-1) {
                boolean find = false;
                for(int j = 0; j<i; j++) {
                    if(isLUS(strs[j],strs[i])) {
                        find = true;
                        break;
                    }
                }
                if(!find) {
                    return strs[i].length();
                }
                break;
            }
            
            if(!isLUS(strs[i+1],strs[i])) {
                boolean find = false;
                for(int j = 0; j<i; j++) {
                    if(isLUS(strs[j],strs[i])) {
                        find = true;
                        break;
                    }
                }
                if(!find) {
                    return strs[i].length();
                }
            }
        }
        
        return -1;
    }
    
    public boolean isLUS(String s, String t) {
//        t是否是s的字串，t长度小于等于s的长度
        int start = 0;
        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            start = s.indexOf(ch, start) + 1;
            if(start == 0) {
                return false;
            }
        }
        return true;
    }
}   
