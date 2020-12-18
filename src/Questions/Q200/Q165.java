package Questions.Q200;

public class Q165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int n1 = v1.length;
        int n2 = v2.length;
        int n = Math.max(n1, n2);
        
        for(int i=0; i<n; i++) {
           
                if(i >= n1) {
                    if(trimLeftZeros(v2[i]) > 0) {
                        return -1;
                    }
                    continue;
                }
                if(i >= n2) {
                    if(trimLeftZeros(v1[i]) > 0) {
                        return 1;
                    }
                    continue;
                }
           
                if(i < n1 && i < n2)   {
                    if(trimLeftZeros(v1[i]) > trimLeftZeros(v2[i])) {
                        return 1;
                    }
                    if(trimLeftZeros(v1[i]) < trimLeftZeros(v2[i])) {
                        return -1;
                    }
                }
        }
        
        return 0;
    }
    
    public int trimLeftZeros(String s) {
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i] == 0) {
                c[i] = ' ';
            }else {
                break;
            }
        }
        String res = String.valueOf(c).trim();
        if(res.equals("")) {
            return 0;
        }else {
            return Integer.parseInt(res);
        }
    }
}
