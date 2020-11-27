package main;

import java.util.List;

import Questions.Q100.Q54;
import Questions.Q100.Q59;
import Questions.Q1400.Q1370;
import Questions.Q200.Q118;
import Questions.Q200.Q119;
import Questions.Q200.Q147;
import Questions.Q200.Q148;
import Questions.Q200.Q164;
import Questions.Q200.Q189;
import Questions.Q300.Q222;
import Questions.Q300.Q242;
import Questions.Q400.Q396;
import Questions.Q500.Q452;
import Questions.Q500.Q453;
import Questions.Q500.Q454;
import Questions.Q500.Q498;
import Questions.Q600.Q566;
import Questions.Q600.Q598;
import Questions.Q700.Q661;
import Questions.Q700.Q665;
import common.ListNode;
import common.TreeNode;

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
	    
//	    Q452 q452 = new Q452();
//	    int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
//	    int res = q452.findMinArrowShots(points);
//	    System.out.println(res);
//	    
//	    int x = 10;
//	    int y = 5;
//	    System.out.print(Integer.compare(x, y));
	    
//	    Q189 q189 = new Q189();
//	    int[] nums = new int[] {1,2,3,4,5,6};
//	    int k = 2;
//	    q189.rotate2(nums, k);
//	    for(int i:nums) {
//	        System.out.println(i);
//	    }
	    
//	    Q222 q222 = new Q222();
//	    TreeNode root = new TreeNode(1);
//	    root.left = new TreeNode(2);
//	    root.right = new TreeNode (3);
//	    root.left.left = new TreeNode(4);
//	    root.left.right = new TreeNode(5);
//	    root.right.left = new TreeNode(6);
//	    
//	    int res1 = q222.countNodes1(root);
//	    int res2 = q222.countNodes2(root);
//	    System.out.println(res1);
//	    System.out.println(res2);
	    
//	    Q396 q396 = new Q396();
//	    int[] A = new int[] {4,3,2,6};
//	    int res = q396.maxRotateFunction2(A);
//	    System.out.println(res);
	    
//	    Q54 q54 = new Q54();
//	    int matrix[][] = new int[][] {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
//	    List<Integer> res = q54.spiralOrder(matrix);
//	    for(int i:res) {
//	        System.out.println(i);
//	    }
	    
//	    Q1370 q1370 = new Q1370();
//	    String s = "abcabcabc";
//	    String res = q1370.sortString(s);
//	    System.out.println(res);
	    
//	    Q59 q59 =  new Q59();
//	    int n = 3;
//	    int[][] res = q59.generateMatrix(n);
//	    for(int[] i:res) {
//	        for(int j:i) {
//	            System.out.print(j);
//	        }
//	        System.out.println();
//	    }
	    
//	    Q164 q164 = new Q164();
//	    int[] nums = new int[] {3,4,5,2,42,535,2,4,68,8,43,2,12};
//	    int res1 = q164.maximumGap1(nums);
//	    int res2 = q164.maximumGap1(nums);
//	    System.out.println(res1);
//	    System.out.println(res2);
	    
//	    Q498 q498 = new Q498();
//	    int[][] matrix = new int[][] {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
////	    int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//	    int[] res = q498.findDiagonalOrder1(matrix);
//	    for(int i:res) {
//	        System.out.println(i);
//	    }
	    
//	    int[] A = new int[] {-268435441,-268434600,-268434993,-268435357,-268434692,-268434749,-268435266,-268434456,-268435317,-268435261,-268434827,-268434527,-268434811,-268435165,-268434656,-268434992,-268435385,-268434456,-268435410,-268434590,-268434935,-268434512,-268434502,-268434664,-268435392,-268434592,-268435183,-268435301,-268434930,-268434781,-268434664,-268434995,-268434516,-268434576,-268434474,-268434804,-268435168,-268435241,-268435199,-268434821,-268435402,-268434891,-268435214,-268435340,-268434576,-268434926,-268434902,-268434708,-268435048,-268434793,-268435363,-268435362,-268434993,-268434744,-268435010,-268435001,-268434781,-268434601,-268434736,-268435173,-268435376,-268435321,-268435392,-268435342,-268434630,-268434862,-268435263,-268434841,-268434809,-268435181,-268435184,-268434859,-268434464,-268434702,-268434729,-268434794,-268434935,-268434483,-268434948,-268434482,-268435152,-268434781,-268434622,-268434650,-268435405,-268434901,-268434927,-268435189,-268435028,-268435401,-268434959,-268434515,-268435371,-268435203,-268434729,-268435002,-268435414,-268434803,-268434474,-268434838};
//	    int[] B = new int[] {-268435449,-268434534,-268435051,-268434517,-268434544,-268434879,-268434597,-268435326,-268434748,-268434560,-268435192,-268434478,-268434810,-268435153,-268435061,-268434470,-268434733,-268435363,-268434580,-268435329,-268435227,-268434868,-268434475,-268434829,-268434804,-268434917,-268435134,-268434478,-268434525,-268434567,-268435434,-268435203,-268434804,-268434979,-268435141,-268434879,-268435046,-268435389,-268434928,-268435313,-268434892,-268434623,-268435100,-268434522,-268435178,-268435169,-268434670,-268435040,-268435267,-268434857,-268434667,-268434463,-268434960,-268434903,-268434588,-268435431,-268434466,-268435154,-268434990,-268434544,-268435262,-268435067,-268435158,-268434596,-268434641,-268434466,-268434773,-268435050,-268435293,-268435148,-268434614,-268434504,-268434797,-268435128,-268435336,-268434660,-268435163,-268435405,-268434462,-268434785,-268435383,-268435244,-268435406,-268434939,-268435416,-268435177,-268434580,-268434931,-268434803,-268435114,-268435072,-268434850,-268434500,-268434632,-268435073,-268435366,-268435250,-268435094,-268434460,-268434947};
//	    int[] C = new int[] {268434570,268435299,268434594,268435215,268435163,268434582,268434957,268434905,268434934,268435013,268434659,268435339,268434868,268435282,268435372,268434735,268435201,268434846,268435158,268434479,268434970,268435345,268434991,268434939,268435018,268435409,268434748,268434985,268435016,268434607,268435104,268434693,268435007,268434724,268435410,268434519,268435127,268434513,268435287,268435182,268434786,268435198,268434932,268434973,268434975,268434490,268434879,268434792,268435321,268435421,268434546,268434805,268434979,268434857,268434710,268434704,268435310,268434584,268434688,268434570,268434529,268434935,268435392,268434816,268435018,268435020,268435353,268435447,268434891,268435017,268435350,268435063,268434588,268434799,268434502,268434850,268434596,268434614,268435268,268435023,268435104,268434794,268434895,268434964,268435271,268435130,268434866,268434596,268434721,268434912,268434848,268435244,268435077,268434848,268435322,268434767,268434651,268435129,268435386,268435275};
//	    int[] D = new int[] {268434703,268435305,268434939,268434879,268434698,268435394,268434889,268435213,268435372,268435152,268434962,268434967,268434772,268435121,268434751,268434884,268435060,268435048,268435221,268434797,268434489,268435270,268434499,268434767,268434750,268435025,268434910,268434684,268434486,268434969,268435423,268434999,268435162,268434565,268434852,268435387,268435322,268434503,268435044,268434761,268435151,268435261,268434728,268434686,268434781,268435110,268434743,268435339,268434663,268435305,268435301,268434666,268434469,268434893,268435192,268434568,268434676,268434569,268434963,268434889,268435373,268434510,268434820,268434824,268435285,268435092,268435304,268435201,268434841,268435241,268434497,268435107,268434531,268434556,268434643,268435163,268435226,268435453,268434704,268435013,268434831,268435386,268435058,268435346,268434914,268435404,268435274,268434686,268434757,268434953,268435337,268435108,268435309,268435093,268434780,268434836,268434755,268435191,268434663,268434533};
//	    
//	    Q454 q454 = new Q454();
//	    
//	    int res = q454.fourSumCount1(A, B, C, D);
//	    System.out.println(res);
	    
	    Q566 q566 = new Q566();
	    int[][] nums = new int[][] {{1,2},{3,4}};
	    int r = 1;
	    int c = 4;
	    int[][] res = q566.matrixReshape(nums, r, c);
	    for(int[] i : res) {
	        for(int j:i) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	}
}
