import java.util.List;

import treeNode.TreeNode;
import Questions.Q1;
import Questions.Q129;
//import Questions.Q1207;
import Questions.Q622;
import Questions.Q1365;
import Questions.Q144;
import Questions.Q349;
import Questions.Q463;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1
		/*
		 * Q1 q1 = new Q1(); int[] i = new int[] {1,2,7,14}; int j = 9; int[] result =
		 * q1.twoSum(i, j); System.out.println(result[0]);
		 * System.out.println(result[1]);
		 */
//		Q622
//		["MyCircularQueue","enQueue","Front","isFull","enQueue","enQueue","enQueue","deQueue","enQueue","enQueue","isEmpty","Rear"]
//				[[4],[3],[],[],[7],[2],[5],[],[4],[2],[],[]]
		/*Q622 c = new Q622(4);
		
		System.out.println(c.enQueue(3));
		System.out.println(c.Front());
		System.out.println(c.isFull());
		System.out.println(c.enQueue(7));
		System.out.println(c.enQueue(2));
		System.out.println(c.enQueue(5));
		System.out.println(c.deQueue());
		System.out.println(c.enQueue(4));
		System.out.println(c.enQueue(2));
		System.out.println(c.isEmpty());
		System.out.println(c.Rear());*/

//		Q1365
//		测试快速排序
/*		Q1365 q = new Q1365();
		int nums[] = {3,6,7,4,2};
		int sort[] = nums.clone();
		q.quickSort(sort,0,sort.length-1);
		for (int i=0; i<sort.length; i++){
			System.out.print(sort[i]);
		}
		for (int i=0; i<nums.length; i++){
			System.out.print(nums[i]);
		}
//		测试排序方法
		for (int i=0; i<nums.length; i++){
			System.out.println(q.smallerNumbersThanCurrent2(nums)[i]);
		}*/
		
/*
 * Q144 q = new Q144(); TreeNode root = new TreeNode(2); root.left = new
 * TreeNode(3); root.right = null; root.left.left = new TreeNode(1);
 * List<Integer> l = q.preorderTraversal(root);
 * 
 * while(!l.isEmpty()){ System.out.println(l.get(0)); l.remove(0); }
 */
		
//		Q1207
/*		Q1207 q = new Q1207();
		int[] arr = new int[] {1,2,2,1,1,3};
//		System.out.println(q.uniqueOccurrences1(arr));
		System.out.println(q.uniqueOccurrences2(arr));
*/
		
//		Q129
/*
 * TreeNode root = new TreeNode(2); root.left = new TreeNode(3); root.right =
 * null; root.left.left = new TreeNode(1);
 * 
 * Q129 q = new Q129(); System.out.println(q.sumNumbers(root));
 */
		
//		Q463
/*		int grid1[][] = {{1,0}};
		int grid2[][] = {{1}};
		int grid3[][] = {{0,1,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		for(int i = 0; i< grid3.length;i++) {
			System.out.println("第"+i+"行:");
			System.out.println("第"+i+"行长度:" + grid3[i].length);
			for(int j=0; j< grid3[i].length; j++) {
				System.out.print("第"+j+"列:");
				System.out.print(grid3[i][j]);
			}
			System.out.println();
		}
		Q463 q = new Q463();
		System.out.println(q.islandPerimeter(grid1));
		System.out.println(q.islandPerimeter(grid2));
		System.out.println(q.islandPerimeter(grid3));

*/
		
//		Q349
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		Q349 q = new Q349();
		int[] result = q.intersection(nums1, nums2);
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
}
