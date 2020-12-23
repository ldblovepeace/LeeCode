package Questions.Q600;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q524 {
    public String findLongestWord(String s, List<String> d) {
        List<Integer> strsLength = new ArrayList<Integer>();
        Map<Integer, List<String>> record = new HashMap<Integer, List<String>>();
        
        for(int i=0; i<d.size(); i++) {
            String tmp = d.get(i);
            if(record.containsKey(tmp.length())) {
                record.get(tmp.length()).add(tmp);
            }else {
                strsLength.add(tmp.length());
                List<String> l = new ArrayList<>();
                l.add(tmp);
                record.put(tmp.length(),l);
            }
        }
        
        strsLength.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o2-o1;
            }
            
        });
        
        for(int i=0; i<strsLength.size(); i++) {
            List<String> l = record.get(strsLength.get(i));
            l.sort(new Comparator<String>(){

                @Override
                public int compare(String o1, String o2) {
                    // TODO Auto-generated method stub
                    for(int i=0; i<o1.length(); i++) {
                        if(o1.charAt(i) < o2.charAt(i)) {
                            return -1;
                        }
                        if(o1.charAt(i) > o2.charAt(i)) {
                            return 1;
                        }
                    }
                    return 0;
                }
                
            });
            
            for(int j=0; j<l.size(); j++) {
                if(isSubString(s,l.get(j))) {
                    return l.get(j);
                }
            }
        }
        
        return "";
    }
    
    public String findLongestWord1(String s, List<String> d) {
       d.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                if(o1.length() - o2.length() > 0) {
                    return -1;
                }
                if(o1.length() - o2.length() < 0) {
                    return 1;
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
        
        for(int i=0; i<d.size(); i++) {
            if(isSubString(s,d.get(i))) {
                return d.get(i);
            }
        }
        
        return "";
    }
    
    public boolean isSubString(String s, String t) {
        int start = 0;
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            start = s.indexOf(c, start) + 1;
            if(start == 0) {
                return false;
            }
        }
        return true;
    }
}
