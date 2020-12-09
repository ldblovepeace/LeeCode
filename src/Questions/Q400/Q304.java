package Questions.Q400;

public class Q304 {
    private int[][] sum;
    
    public Q304(int[][] matrix) {
        int m = matrix.length;
        if(m == 0) {
            return;
        }
        int n = matrix[0].length;

        sum = new int[m][n];
        
        sum[0][0] = matrix[0][0];
        
        for(int i=1; i<m; i++) {
            sum[i][0] =sum[i-1][0] + matrix[i][0];
        }
        
        for(int j=1; j<n; j++) {
            sum[0][j] =sum[0][j-1] + matrix[0][j];
        }
        
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                sum[i][j] = sum[i][j-1];
                for(int k=0; k<=i; k++) {
                    sum[i][j] = sum[i][j] + matrix[k][j];
                } 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0 && col1 == 0) {
            return sum[row2][col2];
        }
        else if(row1 != 0 && col1 != 0) {
            return sum[row2][col2]-sum[row1-1][col2]-sum[row2][col1-1]+sum[row1-1][col1-1];
        }else {
            if(row1 == 0) {
                return sum[row2][col2]-sum[row2][col1-1];
            }else {
                return sum[row2][col2]-sum[row1-1][col2];
            }
        }
    }
}
