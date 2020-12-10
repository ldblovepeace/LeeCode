package Questions.Q900;

public class Q860 {
    public boolean lemonadeChange(int[] bills) {
        int[] remain = new int[3];
        for(int i=0; i<bills.length; i++) {
            if(bills[i] == 5) {
                remain[0] ++;
            }
            if(bills[i] == 10) {
                remain[0] --;
                remain[1] ++;
                if(remain[0] < 0) {
                    return false;
                }
            }
            if(bills[i] == 20) {
                if(remain[1] > 0) {
                    remain[1] --;
                    remain[0] --;
                    if(remain[0] < 0) {
                        return false;
                    }
                }else {
                    remain[0] = remain[0] - 3;
                    if(remain[0] < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean lemonadeChange1(int[] bills) {
        return true;
    }

}
