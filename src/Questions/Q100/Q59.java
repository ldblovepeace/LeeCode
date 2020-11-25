package Questions.Q100;

public class Q59 {
    public int[][] generateMatrix(int n) {
        int [][] res = new int[n][n];
        int col_right = n;
        int row_down = n;
        int row_up = 0;
        int col_left = 0;
        int num = 1;
        
        while(num<=n*n) {
            for(int i = col_left; i<col_right && num <= n*n; i++) {
                res[row_up][i] = num;
                num++;
            }
            row_up++;
            for(int i = row_up; i<row_down && num <= n*n; i++) {
                res[i][col_right-1] = num;
                num++;
            }
            col_right--;
            for(int i = col_right-1; i>=col_left && num <= n*n; i--) {
                res[row_down-1][i] = num;
                num++;
            }
            row_down--;
            for(int i = row_down-1; i>=row_up && num <= n*n; i--) {
                res[i][col_left] = num;
                num++;
            }
            col_left++;
        }
                
        return res;
    }
}
