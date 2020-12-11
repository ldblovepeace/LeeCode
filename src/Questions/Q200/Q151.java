package Questions.Q200;

public class Q151 {
    public String reverseWords(String s) {
        String[] S = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= S.length-1; i>=0; i--) {
            if(!S[i].equals("")) {
                sb.append(S[i]); 
                if(i!=0){
                    sb.append(" ");
                }
            }
        }
        if(S[0].equals("")) {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
