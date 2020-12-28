package Questions.Q700;

public class Q686 {
    public int repeatedStringMatch(String a, String b) {
//        主要是什么样的情况代表b一定不会包含在a叠加后的字符里
//        1、b中有a没有的字符
//        如果b中的字符a里都有b会不会一定包含在a的叠加字符中？不是！
//        暴力：直接叠加到比b长，如果没有就是没有
        int res = 0;
        String as = "";
        
        for(int i=0; i<b.length(); i++) {
            if(a.indexOf(b.charAt(i)) == -1) {
                return -1;
            }
        }
        
        while(as.length() < b.length()) {
            as += a;
            res ++;
        }
        if(as.length() - b.length() < a.length() && as.indexOf(b) == -1) {
            as += a;
            res++;
        }
        if(as.indexOf(b) != -1) {
            return res;
        }
        return -1;
    }
}
