import Questions.Q1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 q1 = new Q1();
		int[] i = new int[] {1,2,7,14};
		int j = 9;
		int[] result = q1.twoSum(i, j);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
