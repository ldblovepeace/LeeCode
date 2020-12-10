package Questions.Q500;

public class Q434 {
    public int countSegments(String s) {
        int res = 0;
        String[] strs = s.split(" ");
        for(String i : strs){
            if(!i.equals("")){
                res++;
            }
        }
        return res;
    }
}
