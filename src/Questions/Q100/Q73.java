package Questions.Q100;

import java.util.HashSet;
import java.util.Set;

public class Q73 {

    public void setZeroes(int[][] matrix) {
//        记录第几行第几列是0，然后将对应的行列置为0
        
        int m = matrix.length;
        if(m == 0) {
            return;
        }
        int n = matrix[0].length;
        int zeroRow = 1;
        int zeroCol = 1;

        for(int i=0; i<m; i++) {
//          单独记录第一列是否为0
            if(matrix[i][0] == 0) {
                zeroCol = 0;
                break;
            }
        }
        for(int j=0; j<n; j++) {
//          单独记录第一行是否为0
            if(matrix[0][j] == 0) {
                zeroRow = 0;
                break;
            }
        }
        
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] == 0) {
//                  把对应行列第一位设置为0
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int j=n-1; j>0; j--) {
            if(matrix[0][j] == 0) {
                for(int i=1; i<m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=m-1; i>0; i--) {
            if(matrix[i][0] == 0) {
                for(int j=1; j<n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        for(int i=0; i<m && zeroCol == 0; i++) {
            matrix[i][0] = 0;
        }
        for(int j=0; j<n && zeroRow == 0; j++) {
            matrix[0][j] = 0;
        }    
    }

    public void setZeroes1(int[][] matrix) {
//        记录第几行第几列是0，然后将对应的行列置为0
        Set<Integer> row = new HashSet<>();
        Set<Integer> colomn = new HashSet<>();
        
        int m = matrix.length;
        if(m == 0) {
            return;
        }
        int n = matrix[0].length;
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    colomn.add(j);
                }
            }
        }
        
        for(int i:row) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = 0;
            }
        }
        
        for(int j:colomn) {
            for(int i=0; i<m; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
