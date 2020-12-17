package Questions.Q700;

public class Q640 {
    public String solveEquation(String equation) {
        equation = equation.replaceAll("-", "+-");
        
        String left = equation.split("=")[0];
        String right = equation.split("=")[1];
        
        String[] lefts = left.split("\\+");
        String[] rights = right.split("\\+");
        
        int leftx = xAndNums(lefts)[0];
        int leftnum = xAndNums(lefts)[1];
        int rightx = xAndNums(rights)[0];
        int rightnum = xAndNums(rights)[1];
        
        if(leftx == rightx) {
            if(leftnum == rightnum) {
                return "Infinite solutions";
            }
            else {
                return "No solution";
            }
        }
        
        int res = (leftnum - rightnum)/(rightx - leftx);
        
        return "x=" + String.valueOf(res);
    }
    
    public int[] xAndNums(String[] s) {
        int x = 0;
        int n = 0;
        for(String i:s) {
            if(i.equals("")) {
                continue;
            }
            if(i.indexOf('x') != -1) {
                if(i.replace("x", "").equals("")) {
                    x = x + 1;
                }else if(i.replace("x", "").equals("-")){
                    x = x - 1;
                }else {
                    x = x + Integer.parseInt(i.replace("x", ""));
                }
            }else {
                n = n + Integer.parseInt(i);
            }
        }
        return new int[] {x,n};
    }
}
