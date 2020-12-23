package Questions.Q500;

public class Q481 {
    public int magicalString(int n) {
        StringBuilder sb = new StringBuilder();
        int[] record = new int[2];
        
        if(n < 1) {
            return 0;
        }
        
        int next = 1;
        int index = 0;
        
        while(sb.length() < n) {
            sb.append(next);
            record[next-1]++;
            char repeat = sb.charAt(index);
            if(repeat == '2' && sb.length() < n) {
                sb.append(next);
                record[next-1]++;
            }
            next = change(next);
            index ++;
        }
        return record[0];
    }
    
    public String constributeMagicalString(int n) {
        StringBuilder sb = new StringBuilder();
        int[] record = new int[2];
        
        if(n < 1) {
            return null;
        }
        
        int next = 1;
        int index = 0;
        
        while(sb.length() < n) {
            sb.append(next);
            record[next-1]++;
            char repeat = sb.charAt(index);
            if(repeat == '2' && sb.length() < n) {
                sb.append(next);
                record[next-1]++;
            }
            next = change(next);
            index ++;
        }
        return sb.toString();
    }
    
    public int change(int n) {
        if(n == 1) {
            return 2;
        }
        return 1;
    }
}
