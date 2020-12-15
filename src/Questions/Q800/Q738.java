package Questions.Q800;

import java.util.Stack;

public class Q738 {
    public int monotoneIncreasingDigits(int N) {
        char[] c = Integer.toString(N).toCharArray();
        int n = c.length;
        Stack<Character> res = new Stack<>();
        for(int i=n-1; i>=0; i--) {
            if(res.isEmpty()) {
                res.push(c[i]);
            }else {
                if(res.peek()<c[i]) {
                    int tmp = res.size();
                    res.clear();
                    while(tmp>0) {
                        res.push('9');
                        tmp--;
                    }
                    res.push((char) (c[i]-1));
                }else {
                    res.push(c[i]);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(res.peek() == '0') {
            res.pop();
        }
        while(!res.isEmpty()) {
            sb.append(res.pop());
        }
        
        return Integer.parseInt(sb.toString());
    }
}
