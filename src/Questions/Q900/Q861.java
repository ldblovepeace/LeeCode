package Questions.Q900;

public class Q861 {
    public int matrixScore(int[][] A) {
        int res = 0;
        if(A.length < 1) {
            return 0;
        }
//        先换每行开头是0的行，再遍历列，如果多于一半就换，否则不换
        int r = A.length;
        int c = A[0].length;
        
        for(int i=0; i<r; i++) {
            if(A[i][0] == 0) {
                reverse(A,true,i);
            }
        }
        
        for(int j=1; j<c; j++) {
            if(needChange(A,j)) {
                reverse(A,false,j);
            }
        }
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                res = (int)(res + A[i][j]*Math.pow(2,(c-j-1)));
            }
        }
        
        return res;
    }
    
    public void reverse(int[][] A, boolean isLine, int i) {
        int r = A.length;
        int c = A[0].length;
        
        if(isLine) {
//            如果是行，第i行转至
            for(int j=0; j<c; j++) {
                if(A[i][j] == 0) {
                    A[i][j] = 1;
                }else if(A[i][j] == 1) {
                    A[i][j] = 0;
                }
            }
        }
        if(!isLine) {
//          如果不是行，第i列转至
            for(int j=0; j<r; j++) {
                if(A[j][i] == 0) {
                    A[j][i] = 1;
                }else if(A[j][i] == 1) {
                    A[j][i] = 0;
                }
            }
        }
    }
    
    public boolean needChange(int[][] A, int j) {
        boolean change = false;
        int r = A.length;
        int zeros = 0;
        for(int i=0; i<r; i++) {
            if(A[i][j] == 0) {
                zeros++;
            }
        }
        
        if(zeros > Math.ceil(r/2)) {
            change = true;
        }
        
        return change;
    }
}
