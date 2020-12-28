package Questions.Q700;

import java.util.Arrays;

public class Q621 {
    public int leastInterval(char[] tasks, int n) {
        int[] record = new int[26];
        for(int i=0; i<tasks.length; i++) {
            record[tasks[i] - 'A']++;
        }

        Arrays.sort(record);
        int maxTasks = 0;
        for(int i=25; i>=0; i--) {
            if(record[i] != record[25]) {
                break;
            }
            maxTasks++;
        }
        
        return Math.max((record[25] - 1) * (n + 1) + maxTasks , tasks.length);
    }
}
