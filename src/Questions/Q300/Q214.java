package Questions.Q300;

public class Q214 {
    public String shortestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }
        int n = s.length();
        int start = 1;
        for(int i=n; i>0; i--) {
            if(isPalindrome(s.substring(0, i))){
                start = i;
                break;
            }
        }
        
        StringBuffer prefix=new StringBuffer(s.substring(start,n));
        
        return prefix.reverse().toString()+s;
    }
    
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(s.length() == 0) {
            return true;
        }
        int head = 0;
        int tail = n-1;
        while(head < tail) {
            if(s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
