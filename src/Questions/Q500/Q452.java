package Questions.Q500;

import java.util.Arrays;
import java.util.Comparator;

public class Q452 {
    public int findMinArrowShots(int[][] points) {
        int res = 0;
        
        if(points.length == 0) {
            return 0;
        }
        
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                if(Integer.compare(o1[0], o2[0]) == 0) {
                    return Integer.compare(o1[1], o2[1]);
                }
                return Integer.compare(o1[0], o2[0]);
            }
            
        });
        
        int[] basePoint = points[0];
        int i = 0;
        while(i < points.length) {
            if(basePoint[1] < points[i][0]) {
                res ++;
                basePoint = points[i];
            }
            if(basePoint[1] > points[i][1]) {
                basePoint[1] = points[i][1];
            }
            i++;
        }
        
        return res+1;
    }
}
