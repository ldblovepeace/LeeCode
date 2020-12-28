package Questions.Q500;

public class Q482 {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("-", "").toUpperCase();
        
        if(S.length() <= K) {
            return S;
        }
        
        int firstLength = (S.length()%K > 0) ? S.length()%K : K;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        while(firstLength > 0) {
            sb.append(S.charAt(index));
            index ++;
            firstLength --;
        }
        
        while(index < S.length()) {
            sb.append('-');
            int repeat = K;
            while(repeat > 0) {
                sb.append(S.charAt(index));
                index ++;
                repeat --;
            }
        }
        return sb.toString();
    }
}
