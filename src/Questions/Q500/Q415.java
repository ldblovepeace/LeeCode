package Questions.Q500;

public class Q415 {
    public String addStrings(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int n = Math.max(num1.length(), num2.length());
        int[] res = new int[n];
        for(int i = n-1; i>=0; i--) {
            if(n-i <= n1.length) {
                res[i] = n1[n1.length - n + i] - '0';
            }
        }
        
        for(int i = n-1; i>=0; i--) {
            if(n-i <= n2.length) {
                res[i] = res[i] + n2[n2.length - n + i] - '0';
            }
        }
        
        for(int i = res.length-1; i>0; i--) {
            if(res[i] >= 10) {
                res[i-1]  += res[i]/10 ;
                res[i] = res[i] % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        
        if(res[0] >= 10) {
            sb.append(res[0]/10);
            res[0] = res[0]%10;
        }
        for(int i=0; i<res.length; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
