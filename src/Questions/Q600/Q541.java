package Questions.Q600;

public class Q541 {
    public String reverseStr(String s, int k) {
        int n = s.length();
        
        int head = 0;
        int tail = Math.min(k, n);
        
        StringBuilder res = new StringBuilder();
        
        while(head < n && tail <= n) {
            StringBuilder sb = new StringBuilder();
            for(int i=head; i<tail; i++) {
                sb.append(s.charAt(i));
            }
            res.append(sb.reverse());
            head = head+k;
            tail = Math.min(tail+k, n);
            if(head > n) {
                break;
            }else {
                res.append(s.substring(head, tail));
            }
            head = head+k;
            tail = Math.min(tail+k, n);
        }
        
        return res.toString();
    }
}
