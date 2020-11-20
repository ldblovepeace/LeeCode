package Questions.Q700;

public class Q661 {
	public int[][] imageSmoother(int[][] M) {
	    int[][] res = new int[M.length][M[0].length];
	    for(int i = 0; i<res.length;i++) {
	        for(int j = 0; j< res[0].length; j++) {
	            int sum = 0;
	            int num = 0;
	            for(int q = i-1; q <= i+1 ; q++) {
	                if(q<0 || q > M.length-1) {
	                    continue;
	                }
	                for(int p = j-1; p <= j+1; p++) {
	                    if(p < 0 || p > M[0].length-1) {
	                        continue;
	                    }
	                    num++;
	                    sum = sum + M[q][p];
	                }
	            }
	            res[i][j] = (int) Math.floor(sum/num);
	        }
	    }
	    return res;
    }
}
