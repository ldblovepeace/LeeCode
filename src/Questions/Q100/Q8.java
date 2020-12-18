package Questions.Q100;

public class Q8 {
    public int myAtoi(String s) {
        s = s.trim();
        char[] c = s.toCharArray();
        int n = c.length;
        StringBuilder sb = new StringBuilder();

        if(n == 0) {
            return 0;
        }
        
        if(c[0] == '+' || c[0] == '-' || (c[0] >= '0' && c[0] <= '9')) {
            sb.append(c[0]);
        }else {
            return 0;
        }
        
        for(int i=1; i<n; i++) {
            if(c[i] >= '0' && c[i] <= '9') {
                sb.append(c[i]);
                if(Long.parseLong(sb.toString()) < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }else if(Long.parseLong(sb.toString()) > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }                 
            }else {
                break;
            }
        }
        
        if(sb.length() == 1 && (sb.charAt(0) < '0' || sb.charAt(0) > '9')) {
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }
}
