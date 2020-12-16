package Questions.Q500;

import java.util.ArrayList;
import java.util.List;

public class Q412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            String tmp = "";
            if(i%3 == 0) {
                tmp = "Fizz";
            }
            if(i%5 == 0) {
                tmp = tmp + "Buzz";
            }
            if(tmp.equals("")) {
                tmp = String.valueOf(i);
            }
            res.add(tmp);
        }
        return res;
    }
}
