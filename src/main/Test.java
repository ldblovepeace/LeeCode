package main;
import java.util.List;
import java.util.ArrayList;
import Questions.Q1;
import Questions.Q1122;
import Questions.Q127;
import Questions.Q129;
import Questions.Q1301;
//import Questions.Q1207;
import Questions.Q622;
import Questions.Q941;
import common.ListNode;
import common.TreeNode;
import Questions.Q1365;
import Questions.Q144;
import Questions.Q31;
import Questions.Q349;
import Questions.Q402;
import Questions.Q414;
import Questions.Q463;
import Questions.Q495;
import Questions.Q514;

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
/*
 * int[] nums1 = {1,2,2,1}; int[] nums2 = {2,2};
 * 
 * Q349 q = new Q349(); int[] result = q.intersection(nums1, nums2); for(int i =
 * 0; i < result.length; i++){ System.out.println(result[i]); }
 */
		
//		Q1301
/*
 * List<String> board = new ArrayList<>(); board.add("E11"); board.add("133");
 * board.add("13S"); Q1301 q = new Q1301();
 * System.out.println(q.pathsWithMaxScore1(board)[0]);
 * System.out.println(q.pathsWithMaxScore1(board)[1]);
 * System.out.println(q.pathsWithMaxScore(board)[0]);
 * System.out.println(q.pathsWithMaxScore(board)[1]);
 */
//		Q941
/*
 * Q941 q = new Q941(); int[] A = {0,3,2,1};
 * System.out.println(q.validMountainArray(A));
 */
//		Q127
//		Q127 q127 = new Q127();
//		String word = "like";
//		String listWord = "like";
//		System.out.println(q127.isTransfer(word, listWord));
//		Q31
//		Q31 q31 = new Q31();
//		int[] nums = {1,4,3,2};
//		q31.nextPermutation(nums);
//		for(int i = 0; i< nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
//		Q514
//		Q514 q514 = new Q514();
//		String ring = "caotmcaataijjxi";
//		String key = "oatji";
////		oatjiioicitatajtijciocjcaaxaaatmctxamacaamjjx
//		System.out.println(q514.findRotateSteps2(ring, key));
//		System.out.println(q514.findRotateSteps1(ring, key));
		
//		Q495
//		Q495 q495 = new Q495();
//		int[] timeSeries = {1,4};
//		int duration = 2;
//		System.out.println(q495.findPoisonedDuration(timeSeries, duration));
		
//		Q414
//		Q414 q414 = new Q414();
//		int[] nums1 = {1,2,2,5};
//		int[] nums2 = {1,2,2};
//		int[] nums3 = {1,2};
//		int[] nums4 = {1,2,2,5,7,1,9,19};
//		int[] nums5 = {1,2,-2147483648};
//		System.out.println(q414.thirdMax(nums1));
//		System.out.println(q414.thirdMax(nums2));
//		System.out.println(q414.thirdMax(nums3));
//		System.out.println(q414.thirdMax(nums4));
//		System.out.println(q414.thirdMax(nums5));
		
//		Q328
//		ListNode head =new ListNode(1);
		
//		Q1122
		
//		Q1122 q1122 = new Q1122();
//		
//		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
//		int[] arr2 = {2,1,4,3,9,6};
//		int[] result = q1122.relativeSortArray1(arr1, arr2);
////		int[] result = q1122.relativeSortArray2(arr1, arr2);
//		
//		for(int i = 0; i< result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		String num = "5337";
		int k = 2;
		Q402 q402 = new Q402();
		System.out.println(q402.removeKdigits(num, k));
		System.out.println(q402.removeKdigits4(num, k));
//		System.out.println(num.substring(0, num.length()));
		
	}
}
