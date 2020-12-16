package Questions.Q600;

public class Q537 {
    public String complexNumberMultiply(String a, String b) {
        
        int[] arv = complexNumberRV(a);
        int[] brv = complexNumberRV(b);
        
        int resr = arv[0]*brv[0] - arv[1]*brv[1];
        int resv = arv[0]*brv[1] + arv[1]*brv[0];
        
        return String.valueOf(resr) + "+" + String.valueOf(resv) + "i";
    }
    
    public int[] complexNumberRV(String a) {
        int[] res = new int[2];
        int plus = a.indexOf('+');
        res[0] = Integer.parseInt(a.substring(0, plus));
        res[1] = Integer.parseInt(a.substring(plus+1,a.length()-1));
        return res;
    }
}
