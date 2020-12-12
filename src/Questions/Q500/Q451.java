package Questions.Q500;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q451 {
    public String frequencySort(String s) {
        
        StringBuilder sb = new StringBuilder();
        int[][] record = new int[128][2];
        for(int i=0; i<128; i++) {
            record[i][0] = i;
        }
        for(int i=0; i<s.length(); i++) {
            record[s.charAt(i)][1]++;
        }
        
        Arrays.sort(record, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o2[1] - o1[1];
            }         
            
        });
        
        for(int i=0; i<128; i++) {
            int j = record[i][1];
            if(j == 0) {
                break;
            }
            while(j>0) {
                sb.append((char)record[i][0]);
                j--;
            }
        }
        
        return sb.toString();
    
    }   
}
