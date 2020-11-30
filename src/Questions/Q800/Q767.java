package Questions.Q800;

import java.util.Arrays;
import java.util.Comparator;

public class Q767 {
    public String reorganizeString(String S) {
        int n = S.length();
        int q = n%2;
        int[][] record = new int[26][2];
        for(int i=0; i<n; i++) {
            record[S.charAt(i)-'a'][0]++;
        }
        for(int i=0;i<26;i++) {
            record[i][1] = i; 
            if(q == 1 && record[i][0]>n/2+1 ) {
                return "";
            }
            if(q == 0 && record[i][0]>=n/2+1) {
                return "";
            }
        }
        
        Arrays.sort(record,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o2[0] - o1[0];
            }         
        });
        char[] sb = new char[n];
        int i = 0;
        
            int j = 0;
            while(j<n) {
                while(j<n && record[i][0] > 0) {
                    sb[j] = (char)(record[i][1] + 'a');
                    record[i][0]--;
                    j = j+2;
                }
                if(j<n) {
                    i++;
                }
            }
            j = 1;
            while(j<n) {
                while(j<n && record[i][0] > 0) {
                    sb[j] = (char)(record[i][1] + 'a');
                    record[i][0]--;
                    j = j+2;
                }
                if(j<n) {
                    i++;
                }
            
        }
        
        return String.valueOf(sb);
    }
}
