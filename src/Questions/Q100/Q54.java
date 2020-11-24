package Questions.Q100;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int up = 0;
        int down = matrix.length;
        int left = 0;
        int right = matrix[0].length;
        
        int count = 0;
        int n = down*right;
        
        while(count<n){
            for(int i = left; i<right && count < n;i++){
                res.add(matrix[up][i]);
                count++;
            }
            up++;
            for(int i = up; i<down && count < n; i++){
                res.add(matrix[i][right-1]);
                count++;
            }
            right--;
            for(int i =right-1; i>=left && count < n; i--){
                res.add(matrix[down-1][i]);
                count++;
            }
            down--;
            for(int i = down-1; i>=up && count < n; i--){
                res.add(matrix[i][left]);
                count++;
            }
            left++;
        }
                
        return res;
    }
}
