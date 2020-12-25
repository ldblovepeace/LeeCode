package Questions.Q500;

import java.util.Arrays;

public class Q455 {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        int gindex = g.length-1;
        int sindex = s.length-1;
        
        while(sindex >= 0 && gindex >= 0) {
            if(s[sindex] >= g[gindex]) {
                res++;
                sindex--;
                gindex--;
            }
            else if(s[sindex] < g[gindex]) {
                gindex--;
            }
            
        }
        
        return res;
    }
}
