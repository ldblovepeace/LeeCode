package Questions.Q600;

public class Q557 {
    public String reverseWords(String s) {
//      不考虑多余空格情况
        String[] S = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length; i++) {
            for(int j=S[i].length()-1; j>=0; j--) {
                sb.append(S[i].charAt(j));
            }
            if(i != S.length-1) {
                sb.append(' ');
            }
        }
        return sb.toString();
  }
    public String reverseWords2(String s) {
//      不考虑多余空格情况
      char[] chars = s.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<s.length(); i++) {
          int start = i;
          int end = i;
          if(chars[i] == ' ') {
              sb.append(chars[i]);
          }else {
              while(end<s.length() && chars[end] != ' ') {
                  end++;
              }
              for(int j = end-1; j>=start; j--) {
                  sb.append(chars[j]);
              }
              i = end-1;
          }
      }
      return sb.toString();
  }
    public String reverseWords1(String s) {
//        考虑多余空格情况
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            int start = i;
            int end = i;
            if(chars[i] == ' ') {
                sb.append(chars[i]);
            }else {
                while(end<s.length() && chars[end] != ' ') {
                    end++;
                }
                for(int j = end-1; j>=start; j--) {
                    sb.append(chars[j]);
                }
                i = end-1;
            }
        }
        return sb.toString();
    }
}
