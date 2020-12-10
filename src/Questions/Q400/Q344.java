package Questions.Q400;

public class Q344 {
    public void reverseString(char[] s) {
        int n = s.length;
        int head = 0;
        int tail = n-1;
        while(head<tail) {
            char tmp = s[head];
            s[head] = s[tail];
            s[tail] = tmp;
            head++;
            tail--;
        }
    }
}
