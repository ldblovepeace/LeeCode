package Questions.Q100;

public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        
        if(minLength == 0) {
            return "";
        }
        
        int index = 0;
        
        while(index < minLength) {
            for(String s:strs) {
                if(s.charAt(index) == strs[0].charAt(index) ) {
                   continue;
                }else {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(index));
            index++;
        }
        
        return sb.toString();
    }
}
