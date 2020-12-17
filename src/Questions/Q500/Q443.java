package Questions.Q500;

public class Q443 {
    public int compress(char[] chars) {
        int n = chars.length;
        char c = chars[0];
        int clength = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for(int i=1; i<n; i++) {
            if(chars[i] == c) {
                clength++;
            }else {
                if(clength != 1) {
                    sb.append(clength);
                }
                c = chars[i];
                sb.append(c);
                clength = 1;
            }
        }
        if(clength != 1) {
            sb.append(clength);
        }
        char[] newchars = sb.toString().toCharArray();
        for(int i=0; i<newchars.length; i++) {
            chars[i] = newchars[i];
        }
        return newchars.length;
    }
    

    public int compress1(char[] chars) {
//        还有一点问题
        int n = chars.length;
        char c = chars[0];
        int clength = 1;
        int cstart = 1;
        for(int i=1; i<n; i++) {
            if(chars[i] == c) {
                clength++;
            }else {
                if(clength != 1) {
                    char[] newchar = String.valueOf(clength).toCharArray();
                    for(int j=0; j<newchar.length; j++) {
                        chars[j+cstart] = newchar[j];
                    }
                    cstart = cstart + newchar.length;
                    chars[cstart] = chars[i];
                    cstart++;
                    c = chars[i];
                    clength = 1;
                }else {
                    if(i+1<n) {
                        chars[cstart] = chars[i+1];
                    }
                    cstart++;
                }
            }
        }
        
        if(clength != 1) {
            char[] newchar = String.valueOf(clength).toCharArray();
            for(int j=0; j<newchar.length; j++) {
                chars[j+cstart] = newchar[j];
            }
            cstart = cstart + newchar.length;
        }
        
        return cstart;
    }

}
