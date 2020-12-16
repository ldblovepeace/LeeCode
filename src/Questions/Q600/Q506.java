package Questions.Q600;

import java.util.Arrays;
import java.util.Comparator;

public class Q506 {
    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        int[][] record = new int[n][2];
        String[] res = new String[n];
        for(int i=0; i<n; i++) {
            record[i][0] = nums[i];
            record[i][1] = i;
        }
        
        Arrays.sort(record, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o2[0] - o1[0];
            }
            
        });
        
        for(int i=0; i<n; i++) {
            record[i][0] = i;
        }
        
        for(int i=0; i<n; i++) {
            if(record[i][0] == 0) {
                res[record[i][1]] = "Gold Medal";
            }
            else if(record[i][0] == 1) {
                res[record[i][1]] = "Silver Medal";
            }else if(record[i][0] == 2) {
                res[record[i][1]] = "Bronze Medal";
            }else {
                res[record[i][1]] = String.valueOf(record[i][0] - 1);
            }
        }
        
        return res;
    }
}
