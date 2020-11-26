package Questions.Q500;

import java.util.ArrayList;
import java.util.List;

public class Q498 {
    public int[] findDiagonalOrder1(int[][] matrix) {
        int row = matrix.length;
        if(row == 0) {
            return new int[0];
        }
        
        int col = matrix[0].length;
        int[] res = new int[row*col];
//        res记录结果
        int n = 0;
        List<Integer> l = new ArrayList<>();
//        l记录边界位置
        for(int i = 0; i< row; i++) {
            int r = i;
            for(int j = 0; j < i+1 && j< col; j++) {
                res[n] = matrix[r][j];
                n++;
                r--;
            }
            l.add(n-1);
        }
        
        for(int j = 1; j < col; j++) {
            int c = j;
            for(int i = row-1; i>0 && c<col; i--) {
                res[n] = matrix[i][c];
                n++;
                c++;
            }
            l.add(n-1);
        }
                
        return res;
    }
    
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            tmp--;
        }
    }
    
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
