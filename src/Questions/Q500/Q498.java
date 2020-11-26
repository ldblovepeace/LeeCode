package Questions.Q500;

public class Q498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length == 0){
            return new int[0];
        }

        
        int col = matrix[0].length;
        int row = matrix.length;
        int[] res = new int[col*row];
        int n = 0;
        int direction = 1;
        int c = 0;
        int r = 0;  
//      设置四个方向 1 代表右向；2代表左下；3代表下；4代表右上
//      c,r代表当前位置
        res[n] = matrix[r][c];
        n++;
        
        while(n < col*row) {       
            if(direction == 1) {
                if(c == col-1) {
                    direction = 3;
                    continue;
                }
                c++;
                res[n] = matrix[r][c];
                n++;
                if(r == 0) {
                    direction = 2;
                    continue;
                }
                if(r == row-1) {
                    direction = 4;
                    continue;
                }              
            }
            
            if(direction == 2) {
                while(r<row-1 && c>0) {
                    r++;
                    c--;
                    res[n] = matrix[r][c];
                    n++;
                }
                if(r == row-1) {
                    direction = 1;
                    continue;
                }
                if(c == 0) {
                    direction = 3;
                    continue;
                }
            }
            
            if(direction == 3) {
                if(r == row-1) {
                    direction = 1;
                    continue;
                }
                r++;
                res[n] = matrix[r][c];
                n++;
                if(c == 0) {
                    direction = 4;
                    continue;
                }
                if(c == col -1) {
                    direction = 2;
                    continue;
                }
            }
            
            if(direction == 4) {
                while(r>0 && c<col-1) {
                    r--;
                    c++;
                    res[n] = matrix[r][c];
                    n++;
                }
                if(r == 0) {
                    direction = 1;
                    continue;
                }
                if(c == col-1) {
                    direction = 3;
                    continue;
                }
            }
        }
        
        return res;
    }
}
