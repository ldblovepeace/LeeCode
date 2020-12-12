package Questions.Q700;

public class Q657 {
    public boolean judgeCircle(String moves) {
        int[] record = new int[4];
        moves = moves.toUpperCase();
        for(int i=0; i<moves.length(); i++) {
            if(moves.charAt(i) == 'L') {
                record[0]++;
            }
            if(moves.charAt(i) == 'R') {
                record[1]++;
            }
            if(moves.charAt(i) == 'U') {
                record[2]++;
            }
            if(moves.charAt(i) == 'D') {
                record[3]++;
            }
        }
        if((record[0]-record[1]!=0) || (record[2]-record[3]!=0)) {
            return false;
        }
        return true;
    }
}
