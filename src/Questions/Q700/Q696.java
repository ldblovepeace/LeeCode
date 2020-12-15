package Questions.Q700;

public class Q696 {
    public int countBinarySubstrings(String s) {
        int first = 0;
        int second = 0;
        int third = 0;
        char[] c = s.toCharArray();
        int n = s.length();
        int res = 0;
        for(int i=0; i<n-1; i++) {
            if(c[i+1] != c[i]) {
                if(first == third) {
                    second = i+1;
                    third = i+1;
                }else {
                    third = i+1;
                    res = res + Math.min(second - first, third - second);
                    first = second;
                    second = third;
                }
            }
        }
        if(second == third) {
//            考虑最后一个连续10
            res = res + Math.min(second - first, n - second);
        }
        return res;
    }
}
