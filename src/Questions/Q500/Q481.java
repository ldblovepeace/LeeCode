package Questions.Q500;

public class Q481 {
    public int magicalString(int n) {
        int one = 0;
        int two = 1;
        for(int i=0; i<n; i++) {
            
        }
        return 0;
    }
    
    public String constributeMagicalString(int n) {
        StringBuilder sb = new StringBuilder();
        int one = 0;
        int two = 0;
        
        while(sb.length() < n) {
            if(sb.length() == 0) {
                sb.append(1);
                one++;
            }else if(sb.length() == 1 || sb.length() == 2) {
                sb.append(2);
                two++;
            }else {
                char last = sb.charAt(sb.length()-1);
                int sum = one + two;
                int repeat = sb.charAt(sum - 1) - '0';
                while (repeat > 0) {
                    sb.append(last);
                    if(last == '1') {
                        one ++;
                    }else {
                        two ++;
                    }
                    repeat --;
                }
                
            }
            
        }
        return sb.toString();
    }
}
