package Questions.Q100;

public class Q66 {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i>=0) {
            int tmp = digits[i] + 1;
            if(tmp != 10) {
                digits[i] = tmp;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
}
