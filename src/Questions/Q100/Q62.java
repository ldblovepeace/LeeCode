package Questions.Q100;

import java.util.Arrays;

public class Q62 {
    public int uniquePaths(int m, int n) {
//        int res = 0;
        int[][] paths = new int[m+1][n+1];
        if(m == 0){
            return 0;
        }
        
        paths[m-1][n-1] = 1;
        
        for(int i=m-1; i>=0; i--) {
            for(int j=n-1; j>=0; j--) {
                paths[i][j] = paths[i][j] + paths[i+1][j] +paths[i][j+1];
            }
        }
        return paths[0][0];
    }
}
