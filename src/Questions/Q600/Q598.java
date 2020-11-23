package Questions.Q600;

public class Q598{
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;
        for(int i = 0; i<ops.length; i++){
            if(ops[i][0] <= minRow){
                minRow = ops[i][0];
            }
            if(ops[i][1] <= minCol){
                minCol = ops[i][1];
            }
        }
        
        return minRow * minCol;
    }
}