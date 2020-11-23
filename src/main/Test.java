package main;

import java.util.List;

import Questions.Q200.Q118;
import Questions.Q200.Q119;
import Questions.Q200.Q147;
import Questions.Q200.Q148;
import Questions.Q300.Q242;
import Questions.Q500.Q452;
import Questions.Q500.Q453;
import Questions.Q600.Q598;
import Questions.Q700.Q661;
import Questions.Q700.Q665;
import common.ListNode;

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
		
//		String num = "5337";
//		int k = 2;
//		Q402 q402 = new Q402();
//		System.out.println(q402.removeKdigits(num, k));
//		System.out.println(q402.removeKdigits4(num, k));
////		System.out.println(num.substring(0, num.length()));
		
		
//		int[] num = {6,5,7,4,3,1,8};
//		Sort s = new Sort();
//		s.fastSort(num, 0, num.length-1);
//		for(int i = 0; i < num.length;i++) {
//			System.out.println(num[i]);
//		}
//		for(int n : num) {
//			System.out.println(n);
//		}
		
//		int[][] num = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};
//		Q406 q406 = new Q406();
//		q406.reconstructQueue(num);
////		q406.fastSort(num, 0, num.length-1);
//		for(int[] n : num) {
//			for(int j : n) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		Q628
//		Q628 q628 = new Q628();
//		int[] nums = {4,2,5,5,6,0};
//		System.out.println(q628.maximumProduct(nums));
		
//		Q697 
//		Q697 q697 = new Q697();
//		int[] nums = {1,2,2,3,1};
//		System.out.println(q697.findShortestSubArray(nums));
		
		
//		Q1030
//		Q1030 q1030 = new Q1030();
//		int R = 2;
//		int C = 2;
//		int r0 = 0;
//		int c0 = 1;
//		
//		int[][] res = q1030.allCellsDistOrder(R, C, r0, c0);
//		
//		for(int[] i : res) {
//			for(int j:i) {
//				System.out.print(i[j]);
//			}
//			System.out.println();
//		}
		
//		Q134
//		Q134 q134 = new Q134();
//		int[] gas = new int[] {5,1,2,3,4};
//		int[] cost = new int[] {4,4,1,5,1};
//		
//		System.out.println(q134.canCompleteCircuit(gas, cost));
//		System.out.println(q134.canCompleteCircuit2(gas, cost));
////		System.out.println(q134.canCompleteCircuit3(gas, cost));
		
//		Q41
//		Q41 q41 = new Q41();
//		int[] nums = {5,1,2,3,4};
//		System.out.println(q41.firstMissingPositive(nums));
//		System.out.println(q41.firstMissingPositive3(nums));
		
//		Q274
//		Q274 q274 = new Q274();
//		int[] citations = {1,1};
//
//		System.out.println(q274.hIndex(citations));
//		System.out.println(q274.hIndex3(citations));

//		Q283 q283 = new Q283();
//		int[] nums = new int[] {0,1,0,3,12};
//		
//		q283.moveZeroes(nums);
//		for(int i:nums) {
//			System.out.println(i);
//		}
		
		// Q453 q453 = new Q453();
		// int[] nums = new int[] {0,1,0,3,12};
		// System.out.println(q453.minMoves2(nums));
		// System.out.println(q453.minMoves(nums));

//		Q665 q665 = new Q665();
//		int[] nums = new int[]{5,7,6,10};
//		int[] nums1 = new int[]{1,4,1,2};
//		System.out.println(q665.checkPossibility(nums1));
//		System.out.println(q665.checkPossibility2(nums1));
		
//		Q147 q147 = new Q147();
//		ListNode head = new ListNode(4);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(1);
//		head.next.next.next = new ListNode(3);
//		
//		
//		
//		ListNode index = q147.insertionSortList(head);;
//		
//		while(index.next != null) {
//			System.out.println(index.val);
//			index = index.next;
//		}
//		System.out.println(index.val);
		
//		Q118 q118 = new Q118();
//		int numRows = 5;
//		List<List<Integer>> res = q118.generate(numRows);
//		for(List<Integer> i : res) {
//			for(int j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		Q119 q119 = new Q119();
//		int rowIndex = 6;
//		List<Integer> l = q119.getRow(rowIndex);
//		for(int i:l) {
//			System.out.print(i);
//		}
	    
//	    Q661 q661 = new Q661();
//	    int[][] M = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
//	    int[][] res = q661.imageSmoother(M);
//	    for(int i = 0; i < res.length; i++) {
//	        for(int j:res[i]) {
//	            System.out.println(j);
//	        }
//	    }
	    
// 	    Q148 q148 = new Q148();
// 	    ListNode head = new ListNode(4);
// 	    head.next = new ListNode(2);
// 	    head.next.next = new ListNode(1);
// 	    head.next.next.next = new ListNode(3);	    
// //	    ListNode print = q148.sortList(head);
// 	    ListNode print = q148.mergeSort(head);
// 	    while(print.next!=null) {
// 	        System.out.print(print.val);
// 	        print = print.next;
// 	    }
// 	    System.out.print(print.val);

		// Q242 q242 = new Q242();
		// String s = "anagram";		;
		// String t = "nagaraa";
		// System.out.print(q242.isAnagram(s, t));
		// System.out.print(q242.isAnagram3(s, t));

//		Q598 q598 = new Q598();
//		int m = 5;
//		int n = 3;
//		int[][] ops = {{2,3},{3,3}};
//		int res =q598.maxCount(m, n, ops);
//		System.out.println(res);
	    
	    Q452 q452 = new Q452();
	    int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
	    int res = q452.findMinArrowShots(points);
	    System.out.println(res);
	    
	    int x = 10;
	    int y = 5;
	    System.out.print(Integer.compare(x, y));
	}
}
