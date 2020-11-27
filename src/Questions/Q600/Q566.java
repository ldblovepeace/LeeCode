package Questions.Q600;

public class Q566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int nRow = nums.length;
        if(nRow == 0) {
            return new int[0][0];
        }
        int nCol = nums[0].length;
        
        if(nRow*nCol != r*c) {
            return nums;
        }
        
        int[] record = new int[nRow*nCol];
        int k=0;
        for(int i=0; i< nRow; i++) {
            for(int j=0; j<nCol; j++) {
                record[k] = nums[i][j];
                k++;
            }
        }
        k--;
        int[][] res = new int[r][c];
        for(int i = r-1; i>=0; i--) {
            for(int j = c-1; j>=0; j--) {
                res[i][j] = record[k];
                k--;
            }
        }
        
        return res;
        
    }
}
