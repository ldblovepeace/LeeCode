package Questions.Q700;

public class Q764 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] result = new int[n];
        
        if(n < 2) {
            return 0;
        }
        
        result[0] = cost[0];
        result[1] = cost[1];
        
        for(int i=2; i<n; i++) {
            result[i] = cost[i] + Math.min(result[i-2] , result[i-1]);
        }
        
        return Math.min(result[n-2] , result[n-1]);
    }
}
