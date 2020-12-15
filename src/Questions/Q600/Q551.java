package Questions.Q600;

public class Q551 {
    public boolean checkRecord(String s) {
        int n = s.length();
        int A = 0;
        int late = 0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'A') {
                A++;
                late = 0;
                if(A>1) {
                    return false;
                }
            }
            else if(s.charAt(i) == 'L') {
                late++;
                if(late > 2) {
                    return false;
                }
            }else {
                late = 0;
            }
        }
        return true;
    }
}
