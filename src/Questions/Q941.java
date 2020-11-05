package Questions;

public class Q941 {
	public boolean validMountainArray(int[] A) {
		int length = A.length;
		int top = 0;
		while (top < length -1 && A[top] < A[top+1]) {
			top ++;
		}
		
		if (top == 0 || top == length-1) {
			return false;
		}
		
		for(int j = top+1; j<length; j++) {
			if(A[j]>= A[j-1]) {
				return false;
			}
		}
		return true;
    }
}
