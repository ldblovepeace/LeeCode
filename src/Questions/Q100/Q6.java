package Questions.Q100;

public class Q6 {
    public String convert(String s, int numRows) {
        int n = s.length();
        int row = 0;
        if( numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        while(sb.length() < n) {
            if(row == numRows-1 || row == 0) {
                int index = row;
                while(index < n) {
                    sb.append(s.charAt(index));
                    index += 2*numRows - 2;
                }
                row++;
            }else {
                int index = row;
                boolean down = true;
                while(index < n) {
                    sb.append(s.charAt(index));
                    if(down) {
                        index += (numRows - row) * 2 - 2;
                        down = !down; 
                    }else {
                        index += 2*(row +1) - 2;
                        down = !down; 
                    }
                }
                row++;
            }
            
        }
        return sb.toString();
    }
}
