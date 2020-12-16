package Questions.Q600;

import java.util.Arrays;
import java.util.List;

public class Q539 {
    public int findMinDifference(List<String> timePoints) {
        int minGap = 24*60;
        int n = timePoints.size();
        int[] minutes = new int[n];
        for(String s:timePoints) {
            minutes[n-1] = hoursToMinutes(s);
            n--;
        }
        Arrays.sort(minutes);
        n = minutes.length;
        for(int i=0; i<n-1; i++) {
            int gap = minutes[i+1] - minutes[i];
            if(gap < minGap) {
                minGap = gap;
            }
        }
        if(60*24 - minutes[n-1] + minutes[0] < minGap) {
            minGap = 60*24 - minutes[n-1] + minutes[0];
        }
        return minGap;
    }
    
    public int hoursToMinutes(String hours) {
        String[] s = hours.split(":");
        int hour = Integer.parseInt(s[0]);
        int minute = Integer.parseInt(s[1]);
        return 60*hour+minute;
    }
}
