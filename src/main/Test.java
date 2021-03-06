package main;

import java.awt.datatransfer.SystemFlavorMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Questions.Q100.Q12;
import Questions.Q100.Q13;
import Questions.Q100.Q28;
import Questions.Q100.Q34;
import Questions.Q100.Q38;
import Questions.Q100.Q43;
import Questions.Q100.Q49;
import Questions.Q100.Q54;
import Questions.Q100.Q58;
import Questions.Q100.Q59;
import Questions.Q100.Q6;
import Questions.Q100.Q62;
import Questions.Q100.Q67;
import Questions.Q100.Q68;
import Questions.Q100.Q73;
import Questions.Q100.Q8;
import Questions.Q1100.Q1046;
import Questions.Q1400.Q1370;
import Questions.Q200.Q103;
import Questions.Q200.Q118;
import Questions.Q200.Q119;
import Questions.Q200.Q125;
import Questions.Q200.Q135;
import Questions.Q200.Q143;
import Questions.Q200.Q147;
import Questions.Q200.Q148;
import Questions.Q200.Q151;
import Questions.Q200.Q164;
import Questions.Q200.Q165;
import Questions.Q200.Q189;
import Questions.Q300.Q204;
import Questions.Q300.Q205;
import Questions.Q300.Q214;
import Questions.Q300.Q222;
import Questions.Q300.Q238;
import Questions.Q300.Q242;
import Questions.Q300.Q273;
import Questions.Q300.Q290;
import Questions.Q300.Q299;
import Questions.Q400.Q304;
import Questions.Q400.Q306;
import Questions.Q400.Q316;
import Questions.Q400.Q321;
import Questions.Q400.Q376;
import Questions.Q400.Q392;
import Questions.Q400.Q396;
import Questions.Q400.Q493;
import Questions.Q500.Q423;
import Questions.Q500.Q443;
import Questions.Q500.Q451;
import Questions.Q500.Q452;
import Questions.Q500.Q453;
import Questions.Q500.Q454;
import Questions.Q500.Q459;
import Questions.Q500.Q467;
import Questions.Q500.Q481;
import Questions.Q500.Q498;
import Questions.Q600.Q506;
import Questions.Q600.Q520;
import Questions.Q600.Q524;
import Questions.Q600.Q535;
import Questions.Q600.Q537;
import Questions.Q600.Q541;
import Questions.Q600.Q557;
import Questions.Q600.Q566;
import Questions.Q600.Q592;
import Questions.Q600.Q598;
import Questions.Q700.Q640;
import Questions.Q700.Q649;
import Questions.Q700.Q659;
import Questions.Q700.Q661;
import Questions.Q700.Q665;
import Questions.Q700.Q696;
import Questions.Q700.Q764;
import Questions.Q800.Q714;
import Questions.Q800.Q738;
import Questions.Q800.Q767;
import Questions.Q900.Q842;
import common.ListNode;
import common.TreeNode;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//      Q1
        /*
         * Q1 q1 = new Q1(); int[] i = new int[] {1,2,7,14}; int j = 9; int[] result =
         * q1.twoSum(i, j); System.out.println(result[0]);
         * System.out.println(result[1]);
         */
//      Q622
//      ["MyCircularQueue","enQueue","Front","isFull","enQueue","enQueue","enQueue","deQueue","enQueue","enQueue","isEmpty","Rear"]
//              [[4],[3],[],[],[7],[2],[5],[],[4],[2],[],[]]
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

//      Q1365
//      测试快速排序
/*      Q1365 q = new Q1365();
        int nums[] = {3,6,7,4,2};
        int sort[] = nums.clone();
        q.quickSort(sort,0,sort.length-1);
        for (int i=0; i<sort.length; i++){
            System.out.print(sort[i]);
        }
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
        }
//      测试排序方法
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
        
//      Q1207
/*      Q1207 q = new Q1207();
        int[] arr = new int[] {1,2,2,1,1,3};
//      System.out.println(q.uniqueOccurrences1(arr));
        System.out.println(q.uniqueOccurrences2(arr));
*/
        
//      Q129
/*
 * TreeNode root = new TreeNode(2); root.left = new TreeNode(3); root.right =
 * null; root.left.left = new TreeNode(1);
 * 
 * Q129 q = new Q129(); System.out.println(q.sumNumbers(root));
 */
        
//      Q463
/*      int grid1[][] = {{1,0}};
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
        
//      Q349
/*
 * int[] nums1 = {1,2,2,1}; int[] nums2 = {2,2};
 * 
 * Q349 q = new Q349(); int[] result = q.intersection(nums1, nums2); for(int i =
 * 0; i < result.length; i++){ System.out.println(result[i]); }
 */
        
//      Q1301
/*
 * List<String> board = new ArrayList<>(); board.add("E11"); board.add("133");
 * board.add("13S"); Q1301 q = new Q1301();
 * System.out.println(q.pathsWithMaxScore1(board)[0]);
 * System.out.println(q.pathsWithMaxScore1(board)[1]);
 * System.out.println(q.pathsWithMaxScore(board)[0]);
 * System.out.println(q.pathsWithMaxScore(board)[1]);
 */
//      Q941
/*
 * Q941 q = new Q941(); int[] A = {0,3,2,1};
 * System.out.println(q.validMountainArray(A));
 */
//      Q127
//      Q127 q127 = new Q127();
//      String word = "like";
//      String listWord = "like";
//      System.out.println(q127.isTransfer(word, listWord));
//      Q31
//      Q31 q31 = new Q31();
//      int[] nums = {1,4,3,2};
//      q31.nextPermutation(nums);
//      for(int i = 0; i< nums.length; i++) {
//          System.out.println(nums[i]);
//      }
        
//      Q514
//      Q514 q514 = new Q514();
//      String ring = "caotmcaataijjxi";
//      String key = "oatji";
////        oatjiioicitatajtijciocjcaaxaaatmctxamacaamjjx
//      System.out.println(q514.findRotateSteps2(ring, key));
//      System.out.println(q514.findRotateSteps1(ring, key));
        
//      Q495
//      Q495 q495 = new Q495();
//      int[] timeSeries = {1,4};
//      int duration = 2;
//      System.out.println(q495.findPoisonedDuration(timeSeries, duration));
        
//      Q414
//      Q414 q414 = new Q414();
//      int[] nums1 = {1,2,2,5};
//      int[] nums2 = {1,2,2};
//      int[] nums3 = {1,2};
//      int[] nums4 = {1,2,2,5,7,1,9,19};
//      int[] nums5 = {1,2,-2147483648};
//      System.out.println(q414.thirdMax(nums1));
//      System.out.println(q414.thirdMax(nums2));
//      System.out.println(q414.thirdMax(nums3));
//      System.out.println(q414.thirdMax(nums4));
//      System.out.println(q414.thirdMax(nums5));
        
//      Q328
//      ListNode head =new ListNode(1);
        
//      Q1122
        
//      Q1122 q1122 = new Q1122();
//      
//      int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
//      int[] arr2 = {2,1,4,3,9,6};
//      int[] result = q1122.relativeSortArray1(arr1, arr2);
////        int[] result = q1122.relativeSortArray2(arr1, arr2);
//      
//      for(int i = 0; i< result.length; i++) {
//          System.out.println(result[i]);
//      }
        
//      String num = "5337";
//      int k = 2;
//      Q402 q402 = new Q402();
//      System.out.println(q402.removeKdigits(num, k));
//      System.out.println(q402.removeKdigits4(num, k));
////        System.out.println(num.substring(0, num.length()));
        
        
//      int[] num = {6,5,7,4,3,1,8};
//      Sort s = new Sort();
//      s.fastSort(num, 0, num.length-1);
//      for(int i = 0; i < num.length;i++) {
//          System.out.println(num[i]);
//      }
//      for(int n : num) {
//          System.out.println(n);
//      }
        
//      int[][] num = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};
//      Q406 q406 = new Q406();
//      q406.reconstructQueue(num);
////        q406.fastSort(num, 0, num.length-1);
//      for(int[] n : num) {
//          for(int j : n) {
//              System.out.print(j);
//          }
//          System.out.println();
//      }
        
//      Q628
//      Q628 q628 = new Q628();
//      int[] nums = {4,2,5,5,6,0};
//      System.out.println(q628.maximumProduct(nums));
        
//      Q697 
//      Q697 q697 = new Q697();
//      int[] nums = {1,2,2,3,1};
//      System.out.println(q697.findShortestSubArray(nums));
        
        
//      Q1030
//      Q1030 q1030 = new Q1030();
//      int R = 2;
//      int C = 2;
//      int r0 = 0;
//      int c0 = 1;
//      
//      int[][] res = q1030.allCellsDistOrder(R, C, r0, c0);
//      
//      for(int[] i : res) {
//          for(int j:i) {
//              System.out.print(i[j]);
//          }
//          System.out.println();
//      }
        
//      Q134
//      Q134 q134 = new Q134();
//      int[] gas = new int[] {5,1,2,3,4};
//      int[] cost = new int[] {4,4,1,5,1};
//      
//      System.out.println(q134.canCompleteCircuit(gas, cost));
//      System.out.println(q134.canCompleteCircuit2(gas, cost));
////        System.out.println(q134.canCompleteCircuit3(gas, cost));
        
//      Q41
//      Q41 q41 = new Q41();
//      int[] nums = {5,1,2,3,4};
//      System.out.println(q41.firstMissingPositive(nums));
//      System.out.println(q41.firstMissingPositive3(nums));
        
//      Q274
//      Q274 q274 = new Q274();
//      int[] citations = {1,1};
//
//      System.out.println(q274.hIndex(citations));
//      System.out.println(q274.hIndex3(citations));

//      Q283 q283 = new Q283();
//      int[] nums = new int[] {0,1,0,3,12};
//      
//      q283.moveZeroes(nums);
//      for(int i:nums) {
//          System.out.println(i);
//      }
        
        // Q453 q453 = new Q453();
        // int[] nums = new int[] {0,1,0,3,12};
        // System.out.println(q453.minMoves2(nums));
        // System.out.println(q453.minMoves(nums));

//      Q665 q665 = new Q665();
//      int[] nums = new int[]{5,7,6,10};
//      int[] nums1 = new int[]{1,4,1,2};
//      System.out.println(q665.checkPossibility(nums1));
//      System.out.println(q665.checkPossibility2(nums1));
        
//      Q147 q147 = new Q147();
//      ListNode head = new ListNode(4);
//      head.next = new ListNode(2);
//      head.next.next = new ListNode(1);
//      head.next.next.next = new ListNode(3);
//      
//      
//      
//      ListNode index = q147.insertionSortList(head);;
//      
//      while(index.next != null) {
//          System.out.println(index.val);
//          index = index.next;
//      }
//      System.out.println(index.val);
        
//      Q118 q118 = new Q118();
//      int numRows = 5;
//      List<List<Integer>> res = q118.generate(numRows);
//      for(List<Integer> i : res) {
//          for(int j : i) {
//              System.out.print(j);
//          }
//          System.out.println();
//      }
        
//      Q119 q119 = new Q119();
//      int rowIndex = 6;
//      List<Integer> l = q119.getRow(rowIndex);
//      for(int i:l) {
//          System.out.print(i);
//      }
        
//      Q661 q661 = new Q661();
//      int[][] M = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
//      int[][] res = q661.imageSmoother(M);
//      for(int i = 0; i < res.length; i++) {
//          for(int j:res[i]) {
//              System.out.println(j);
//          }
//      }
        
//      Q148 q148 = new Q148();
//      ListNode head = new ListNode(4);
//      head.next = new ListNode(2);
//      head.next.next = new ListNode(1);
//      head.next.next.next = new ListNode(3);      
// //       ListNode print = q148.sortList(head);
//      ListNode print = q148.mergeSort(head);
//      while(print.next!=null) {
//          System.out.print(print.val);
//          print = print.next;
//      }
//      System.out.print(print.val);

        // Q242 q242 = new Q242();
        // String s = "anagram";        ;
        // String t = "nagaraa";
        // System.out.print(q242.isAnagram(s, t));
        // System.out.print(q242.isAnagram3(s, t));

//      Q598 q598 = new Q598();
//      int m = 5;
//      int n = 3;
//      int[][] ops = {{2,3},{3,3}};
//      int res =q598.maxCount(m, n, ops);
//      System.out.println(res);
        
//      Q452 q452 = new Q452();
//      int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
//      int res = q452.findMinArrowShots(points);
//      System.out.println(res);
//      
//      int x = 10;
//      int y = 5;
//      System.out.print(Integer.compare(x, y));
        
//      Q189 q189 = new Q189();
//      int[] nums = new int[] {1,2,3,4,5,6};
//      int k = 2;
//      q189.rotate2(nums, k);
//      for(int i:nums) {
//          System.out.println(i);
//      }
        
//      Q222 q222 = new Q222();
//      TreeNode root = new TreeNode(1);
//      root.left = new TreeNode(2);
//      root.right = new TreeNode (3);
//      root.left.left = new TreeNode(4);
//      root.left.right = new TreeNode(5);
//      root.right.left = new TreeNode(6);
//      
//      int res1 = q222.countNodes1(root);
//      int res2 = q222.countNodes2(root);
//      System.out.println(res1);
//      System.out.println(res2);
        
//      Q396 q396 = new Q396();
//      int[] A = new int[] {4,3,2,6};
//      int res = q396.maxRotateFunction2(A);
//      System.out.println(res);
        
//      Q54 q54 = new Q54();
//      int matrix[][] = new int[][] {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
//      List<Integer> res = q54.spiralOrder(matrix);
//      for(int i:res) {
//          System.out.println(i);
//      }
        
//      Q1370 q1370 = new Q1370();
//      String s = "abcabcabc";
//      String res = q1370.sortString(s);
//      System.out.println(res);
        
//      Q59 q59 =  new Q59();
//      int n = 3;
//      int[][] res = q59.generateMatrix(n);
//      for(int[] i:res) {
//          for(int j:i) {
//              System.out.print(j);
//          }
//          System.out.println();
//      }
        
//      Q164 q164 = new Q164();
//      int[] nums = new int[] {3,4,5,2,42,535,2,4,68,8,43,2,12};
//      int res1 = q164.maximumGap1(nums);
//      int res2 = q164.maximumGap1(nums);
//      System.out.println(res1);
//      System.out.println(res2);
        
//      Q498 q498 = new Q498();
//      int[][] matrix = new int[][] {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
////        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//      int[] res = q498.findDiagonalOrder1(matrix);
//      for(int i:res) {
//          System.out.println(i);
//      }
        
//      int[] A = new int[] {-268435441,-268434600,-268434993,-268435357,-268434692,-268434749,-268435266,-268434456,-268435317,-268435261,-268434827,-268434527,-268434811,-268435165,-268434656,-268434992,-268435385,-268434456,-268435410,-268434590,-268434935,-268434512,-268434502,-268434664,-268435392,-268434592,-268435183,-268435301,-268434930,-268434781,-268434664,-268434995,-268434516,-268434576,-268434474,-268434804,-268435168,-268435241,-268435199,-268434821,-268435402,-268434891,-268435214,-268435340,-268434576,-268434926,-268434902,-268434708,-268435048,-268434793,-268435363,-268435362,-268434993,-268434744,-268435010,-268435001,-268434781,-268434601,-268434736,-268435173,-268435376,-268435321,-268435392,-268435342,-268434630,-268434862,-268435263,-268434841,-268434809,-268435181,-268435184,-268434859,-268434464,-268434702,-268434729,-268434794,-268434935,-268434483,-268434948,-268434482,-268435152,-268434781,-268434622,-268434650,-268435405,-268434901,-268434927,-268435189,-268435028,-268435401,-268434959,-268434515,-268435371,-268435203,-268434729,-268435002,-268435414,-268434803,-268434474,-268434838};
//      int[] B = new int[] {-268435449,-268434534,-268435051,-268434517,-268434544,-268434879,-268434597,-268435326,-268434748,-268434560,-268435192,-268434478,-268434810,-268435153,-268435061,-268434470,-268434733,-268435363,-268434580,-268435329,-268435227,-268434868,-268434475,-268434829,-268434804,-268434917,-268435134,-268434478,-268434525,-268434567,-268435434,-268435203,-268434804,-268434979,-268435141,-268434879,-268435046,-268435389,-268434928,-268435313,-268434892,-268434623,-268435100,-268434522,-268435178,-268435169,-268434670,-268435040,-268435267,-268434857,-268434667,-268434463,-268434960,-268434903,-268434588,-268435431,-268434466,-268435154,-268434990,-268434544,-268435262,-268435067,-268435158,-268434596,-268434641,-268434466,-268434773,-268435050,-268435293,-268435148,-268434614,-268434504,-268434797,-268435128,-268435336,-268434660,-268435163,-268435405,-268434462,-268434785,-268435383,-268435244,-268435406,-268434939,-268435416,-268435177,-268434580,-268434931,-268434803,-268435114,-268435072,-268434850,-268434500,-268434632,-268435073,-268435366,-268435250,-268435094,-268434460,-268434947};
//      int[] C = new int[] {268434570,268435299,268434594,268435215,268435163,268434582,268434957,268434905,268434934,268435013,268434659,268435339,268434868,268435282,268435372,268434735,268435201,268434846,268435158,268434479,268434970,268435345,268434991,268434939,268435018,268435409,268434748,268434985,268435016,268434607,268435104,268434693,268435007,268434724,268435410,268434519,268435127,268434513,268435287,268435182,268434786,268435198,268434932,268434973,268434975,268434490,268434879,268434792,268435321,268435421,268434546,268434805,268434979,268434857,268434710,268434704,268435310,268434584,268434688,268434570,268434529,268434935,268435392,268434816,268435018,268435020,268435353,268435447,268434891,268435017,268435350,268435063,268434588,268434799,268434502,268434850,268434596,268434614,268435268,268435023,268435104,268434794,268434895,268434964,268435271,268435130,268434866,268434596,268434721,268434912,268434848,268435244,268435077,268434848,268435322,268434767,268434651,268435129,268435386,268435275};
//      int[] D = new int[] {268434703,268435305,268434939,268434879,268434698,268435394,268434889,268435213,268435372,268435152,268434962,268434967,268434772,268435121,268434751,268434884,268435060,268435048,268435221,268434797,268434489,268435270,268434499,268434767,268434750,268435025,268434910,268434684,268434486,268434969,268435423,268434999,268435162,268434565,268434852,268435387,268435322,268434503,268435044,268434761,268435151,268435261,268434728,268434686,268434781,268435110,268434743,268435339,268434663,268435305,268435301,268434666,268434469,268434893,268435192,268434568,268434676,268434569,268434963,268434889,268435373,268434510,268434820,268434824,268435285,268435092,268435304,268435201,268434841,268435241,268434497,268435107,268434531,268434556,268434643,268435163,268435226,268435453,268434704,268435013,268434831,268435386,268435058,268435346,268434914,268435404,268435274,268434686,268434757,268434953,268435337,268435108,268435309,268435093,268434780,268434836,268434755,268435191,268434663,268434533};
//      
//      Q454 q454 = new Q454();
//      
//      int res = q454.fourSumCount1(A, B, C, D);
//      System.out.println(res);
        
//      Q566 q566 = new Q566();
//      int[][] nums = new int[][] {{1,2},{3,4}};
//      int r = 1;
//      int c = 4;
//      int[][] res = q566.matrixReshape(nums, r, c);
//      for(int[] i : res) {
//          for(int j:i) {
//              System.out.print(j);
//          }
//          System.out.println();
//      }
        
//      Q493 q493 = new Q493();
//      int[] nums = new int[] {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
//      int res = q493.reversePairs(nums);
//      System.out.println(res);
        
//      Q767 q767 = new Q767();
//      String S = "snnnnbpngobwznvnnnlnwhvnnnnfjnnlnnnnnnbnknnqkndzefncknnnnnaiqrntnndnnnjninnnunnunqhndnnqnnsjqnnpiqshntnnncnvnnnncnnqenlnninyndnnnljongnnjwnnnngllnnngkbnllnnnnontlbpngjnnenqnsnnnnnjeqqghnfpngepnodnnnnnnvnsrnughbnipvnhqmnzonoonnnjotnnonoennnpnfnnkdnnbmnmnpnqninnxronnnnvnlanlnnnebnnnlnvnfknsnbincnttnmnguqenhnnxunnnntnnnnhnqnzehvunfnvnndvnjnnnbnnpxnqipwnmnonnndlnsnonnninnxnnnjnnnnnesennmyiednnnnnnnnnhimtnnnonjlicnwnwvnntaxmnrntnnnnsnbnanninnecbcfjxncnnkvnnqgnunensanpnngjnzxjnopnnyvnnxskniyytnsnnnnx";
////        String S = "tndsewnllhrtwsvxenkscbivijfqnysamckzoyfnapuotmdexzkkrpmppttficzerdndssuveompqkemtbwbodrhwsfpbmkafpwyedpcowruntvymxtyyejqtajkcjakghtdwmuygecjncxzcxezgecrxonnszmqmecgvqqkdagvaaucewelchsmebikscciegzoiamovdojrmmwgbxeygibxxltemfgpogjkhobmhwquizuwvhfaiavsxhiknysdghcawcrphaykyashchyomklvghkyabxatmrkmrfsppfhgrwywtlxebgzmevefcqquvhvgounldxkdzndwybxhtycmlybhaaqvodntsvfhwcuhvuccwcsxelafyzushjhfyklvghpfvknprfouevsxmcuhiiiewcluehpmzrjzffnrptwbuhnyahrbzqvirvmffbxvrmynfcnupnukayjghpusewdwrbkhvjnveuiionefmnfxao";
//      String res = q767.reorganizeString(S);
//      System.out.println(res);
        
//      Q34 q34 = new Q34();
//      int[] nums = new int[] {5,6,7,9,10};
//      int target = 8;
//      int[] res = q34.searchRange(nums, target);
//      for(int i:res) {
//          System.out.println(i);
//      }
        

//      Q321 q321 = new Q321();
//      int[] nums1 = new int[] {3,4,6,5};
//      int[] nums2 = new int[] {9,1,2,5,8,3};
//      int k = 4;
//      int res = q321.maxInt(nums2, k);
//      
//          System.out.println(res);
        
//      Q204 q204 = new Q204();
////        int res1 = q204.countPrimes(500);
//      int res2 = q204.countPrimes1(500000);
////        System.out.println(res1);
//      System.out.println(res2);
//      Q321 q321 = new Q321();
//      int[] nums1 = new int[] {3,4,6,5};
//      int[] nums2 = new int[] {9,1,2,5,8,3};
//      int k = 4;
//      int[] res = q321.maxNumber(nums1, nums2, k);
//      for(int i:res){
//          System.out.println(i);
//      }
        
//        System.out.println(Integer.valueOf("1011",2).toString());
//      String s = "10.0.3.193";
//      String[] ip = s.split("\\.");
//      for(String i:ip) {
//          System.out.println(i);
//      }

//      System.out.println(10<<8*3);
//      System.out.println(3<<8*1);
//      System.out.println(193<<8*0);
//      int res = 0;
//      res = res + 10<<8*3;
//      res = res + 3<<8*1;
//      res = res + 193<<8*0;
//      System.out.println(167772160+ 961);
        
//      int ip = 167773121;
//      ip = ip >> 8*2;
//      String res = "10.0.3.193.";
//
//      System.out.println(ip);
//      Q659 q695 = new Q659();
        
//      int[] nums = new int[] {1,5};
//      List<Integer[]> res = q695.divide(nums);
//      for(Integer[] i:res) {
//          for(int j:i) {
//              System.out.print(j);
//          }
//          System.out.println();
//      }
//      int[] nums1 = new int[] {1,2,3,3,4,5};//true
//      int[] nums2 = new int[] {1,2,3,3,4,4,5,5}; // true
//      int[] nums3 = new int[] {1,2,3,4,4,5}; // false
//      int[] nums4 = new int[] {1,2,3,3,4,4,5}; // true
//      int[] nums5 = new int[] {1,2,3,4,4,5,5}; // false
//      int[] nums6 = new int[] {1};//false
//      int[] nums7 = new int[] {4,5,6,7,7,8,8,9,10,11};//true
//      //false
//      int[] nums8 = new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,46,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,53,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,55,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,61,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,69,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,71,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,75,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,78,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,79,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,84,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,85,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,86,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,87,88,88,88,88,88,88,88,88,88,88,88,88,88,88,88,88,88,88,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,89,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,94,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,96,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,97,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,98,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
////        System.out.println(q695.isPossible(nums1));
//      System.out.println(q695.isPossible(nums2));
//      System.out.println(q695.isPossible(nums3));
//      System.out.println(q695.isPossible(nums4));
//      System.out.println(q695.isPossible(nums5));
//      System.out.println(q695.isPossible(nums6));
//      System.out.println(q695.isPossible(nums7));
//      System.out.println(q695.isPossible(nums8));
//      System.out.println(Math.pow(2,8*3)-1);
        
//      double i = (double)5/3;
//      System.out.println(i);
//      System.out.println(Math.floor(4/3));
//      System.out.println(Math.floor(5/3));
//      System.out.println(Math.floor(i));
//      System.out.println(Math.ceil(4/3));
//        System.out.println(Math.ceil(5/3));
//        System.out.println(Math.ceil(i));
//        System.out.println(Math.round(4/3));
//        System.out.println(Math.round(5/3));
//        System.out.println(Math.round(i));
        
//      Q842 q842 = new Q842();
//      String S1 = "123456579";
//      String S2 = "93662412650570678916";
//      List<Integer> l1 = q842.splitIntoFibonacci(S1);
//      for(int i:l1) {
//          System.out.print(i);
//          System.out.print(';');
//      }
//      List<Integer> l2 = q842.splitIntoFibonacci(S2);
//      for(int i:l2) {
//            System.out.print(i);
//            System.out.print(';');
//        }
//      List<Integer> F1 = q842.isFibonacci(S1, 3, 3);
//      if(F1.size() == 0) {
//          System.out.println("不是Fibonacci");
//      }else {
//          for(int i:F1) {
//              System.out.print(i);
//              System.out.print(';');
//          }
//      }
//      Q62 q62 = new Q62();
//      int m = 3;
//      int n = 4;
//      int res = q62.uniquePaths(m, n);
//      System.out.println(res);
//      
//      Q73 q73 = new Q73();
//      int[][] matrix = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//      q73.setZeroes(matrix);
//      for(int i=0; i<matrix.length; i++) {
//          for(int j=0; j<matrix[0].length; j++) {
//              System.out.print(matrix[i][j]);
//          }
//          System.out.println();
//      }
        
//      int[][] matrix = new int[][] {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
//      Q304 q304 = new Q304(matrix);
//      System.out.println(q304.sumRegion(0,1,2,4));
//      int[][] matrix = new int[][] {{-4,-5}};
//        Q304 q304 = new Q304(matrix);
//        System.out.println(q304.sumRegion(0,1,0,1));
        
//      Q238 q238 = new Q238();
//      int[] nums = new int[] {1,2,3,4};
//      q238.productExceptSelf1(nums);
        
//      Q520 q520 = new Q520();
//      String word = "mL";
//      q520.detectCapitalUse(word);
//      System.out.println('z'-'A');
//      System.out.println('a'-'Z');
//      System.out.println('Z'-'a');
        
//        Q125 q125 = new Q125();
//        String s = "ab_a";
//        System.out.println(q125.isPalindrome(s));
        
//        String s = "Hello,     my name is John";
//        String[] strs = s.split(" ");
//        for(String i:strs) {
//            System.out.print(i);
//            System.out.println(";");
//        }
        
//        String s = "Hello World";
//        Q58 q58 = new Q58();
//        System.out.println(q58.lengthOfLastWord(s));
        
//        String s = "asfads";
//        Q541 q541 = new Q541();
//        String res = q541.reverseStr(s, 2);
//        System.out.println(res);
//        String s = "contest";
//        Q557 q557 = new Q557();
//        String res = q557.reverseWords2(s);
//        System.out.println(res);
//        String string="a   b  a  a ";
//        for(String a:string.split("\\s+")){
//            System.out.println(a);
//        }
        
//        String s = " Hello World!";
//        Q151 q151 = new Q151();
//        q151.reverseWords(s);
        
//        String senate = "RDDR";
//        Q649 q649 = new Q649();
//        String res = q649.predictPartyVictory(senate);
//        System.out.println(res);
//        
//        String s = "asd  fas sdfas";
//        System.out.println(s.replaceAll(" ", ""));
//        char[] c = new char[] {' ',' ','R'};
//        String.copyValueOf(c);
//        System.out.println(String.valueOf(c).replaceAll(" ", ""));
//        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
//        Q49 q49 = new Q49();
//        q49.groupAnagrams2(strs);
        
//        String s = "ttre";
//        Q451 q451 = new Q451();
//        q451.frequencySort(s);
//        int[] nums = new int[] {2,23,13,2,3,4234,12,3412,34,12,34,2,1,3,412,3,41,23,412,3,412,3,412,34,2,435,32,412};
//        Q376 q376 = new Q376();
//        System.out.println(q376.wiggleMaxLength(nums));
        
//        Q423 q423 = new Q423();
//        String s = "owoztneoer";
//        q423.originalDigits(s);
        
//        Q738 q738 = new Q738();
//        int N = 1234;
//        int res = q738.monotoneIncreasingDigits(N);
//        System.out.println(res);
        
//        String s = "00110";
//        Q696 q696 = new Q696();
//        int res = q696.countBinarySubstrings(s);
//        System.out.println(res);
        
//        String p = "zabcab";
//        Q467 q467 = new Q467();
//        int res = q467.findSubstringInWraproundString2(p);
//        System.out.println(res);
        
//        String pattern = "abba";
//        String s = "dog cat cat dog";
//        Q290 q290 = new Q290();
//        q290.wordPattern(pattern, s);
        
//        Q535 q535 = new Q535();
//        String longUrl = "https://leetcode.com/problems/design-tinyurl";
//        String shortUrl = q535.encode(longUrl);
//        String decodeShrotUrl = q535.decode(shortUrl);
//        
//        System.out.println(shortUrl);
//        System.out.println(decodeShrotUrl);
        
//        Q299 q299 = new Q299();
//        String secret = "1807";
//        String guess = "7810";
//        String res = q299.getHint(secret, guess);
//        System.out.println(res);
        
//        int[] nums = new int[] {15,2,158,4,26,451,5262,12,3};
//        Q506 q506 = new Q506();
//        String[] res = q506.findRelativeRanks(nums);
//        for(String s : res) {
//            System.out.print(s);
//            System.out.print(' ');
//        }
        
//        String s = "-1";
//        int i = Integer.parseInt(s);
//        System.out.println(i);
        
//        String a = "-1+-1i";
//        Q537 q537 = new Q537();
//        q537.complexNumberRV(a);
        
//        Q714 q714 = new Q714();
//        int[] prices = new int[] {3,1,3,2,8,4,9};
//        int fee = 2;
//        int res = q714.maxProfit(prices, fee);
//        System.out.println(res);
        
//        String s = "14+17";
//        System.out.println(Math.max(s.indexOf('-'), s.indexOf('+')));
//        System.out.println(Integer.parseInt(s.substring(0,Math.max(s.indexOf('-'), s.indexOf('+')))));
//        Q592 q592 = new Q592();
//        int res = q592.biggestCommonDivide(15, 6);
//        String expression = "-17/14+17/10-11/13";
//        String res = q592.fractionAddition(expression);
//        System.out.println(res);
        
//        String s = "x+5-3+x";
//        s = s.replaceAll("-","+-");
//        System.out.println(s.indexOf('z'));
//        String[] res = s.split("\\+");
//        for(String i:res) {
//            System.out.println(i);
//        }
        
//        Q640 q640 = new Q640();
//        String equation = "-x=6+x-2";
//        String res = q640.solveEquation(equation);
//        System.out.println(res);
        
//        Q38 q38 = new Q38();
//        int n = 10;
//        String res = q38.countAndSay(n);
//        System.out.println(res);
//        
//        Q443 q443 = new Q443();
//        char[] chars = new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b','c'};
//        char[] chars1 = new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        char[] chars2 = new char[] {'a'};
//        q443.compress1(chars);
        
//        Q8 q8 = new Q8();
////        String s = "-+42";
//        String s = "3.1415";
//
//        int res = q8.myAtoi(s);
//        System.out.println(res);
        
//        Q13 q13 = new Q13();
////        String s = "MCMXCIV";
//        String s = "MDCXCV";
//        int res = q13.romanToInt(s);
//        System.out.println(res);
        
//        Q12 q12 = new Q12();
//        int num = 1994;
//        String res = q12.intToRoman(num);
//        System.out.println(res);
        
//        Q273 q273 = new Q273();
//        int num = 1234567891;
//        String res = q273.numberToWords(num);
//        System.out.println(res);
        
//        String version1 = "1";
//        String version2 = "1.1.0";
//        Q165 q165 = new Q165();
//        int res = q165.compareVersion(version1, version2);
//        System.out.println(res);
//        
//        Q481 q481 = new Q481();
//        int n = 3;
//        String res = q481.constributeMagicalString(n);
//        System.out.println(res);
//        
//        Q764 q764 = new Q764();
//        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        int res = q764.minCostClimbingStairs(cost);
//        System.out.println(res);
        
//        Q316 q316 = new Q316();
//        String s = "cbacdcbc";
//        String res = q316.removeDuplicateLetters(s);
//        System.out.println(res);
        
//        Q103 q103 = new Q103();
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        
//        List<List<Integer>> res = q103.zigzagLevelOrder(root);
//        
//        for(List<Integer> l:res) {
//            for(int i:l) {
//                System.out.print(i);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
        
//        Q481 q481 = new Q481();
//        int n = 10;
//        String res = q481.constributeMagicalString(n);
//        System.out.println(res);
        
//        Q392 q392 = new Q392();
//        String s = "abcd";
//        String t = "ahbgdc";
//        boolean res = q392.isSubsequence(s, t);
//        System.out.println(res);
        
//        Q524 q524 = new Q524();
//        String s = "abpcplea";
//        List<String> l = new ArrayList<>();
//        l.add("a");
//        l.add("b");
//        l.add("c");
//        String res = q524.findLongestWord(s, l);
//        String res1 = q524.findLongestWord1(s, l);
//
//        System.out.println(res);
//        System.out.println(res1);
        
//        Q135 q135 = new Q135();
//        int[] ratings = {1,2,87,87,87,2,1};
//        int res = q135.candy(ratings);
//        System.out.println(res);
        
//        String begin = new SimpleDateFormat("yyyyMMddHHmmss")
//                .format(new Date(System.currentTimeMillis() - 60 * 60 * 1000));
//        String end = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis()));
//        System.out.println(begin);
//        System.out.println(end);
        
//        String a = "10110";
//        String b = "110";
//        Q67 q67 = new Q67();
//        q67.addBinary(a, b);
        
//        String num1 = "12345";
//        String num2 = "1";
//        Q43 q43 = new Q43();
//        String res = q43.multiply(num1, num2);
//        System.out.println(res);
        
//        String s = "ab";
//        String t = "cd";
//        Q205 q205 = new Q205();
//        boolean res = q205.isIsomorphic(s, t);
//        System.out.println(res);
        
//        String s = "abcdefg";
//        String res1 = s.substring(0,1);
//        String res2 = s.substring(1,2);
//        System.out.println(res1);
//        System.out.println(res2);
        
//        String num = "121474836472147483648";
////        //"0235813" "101" "121474836472147483648"
//        Q306 q306 = new Q306();
//        boolean res = q306.isAdditiveNumber(num);
//        System.out.println(res);
//        
//        String s1 = "123";
//        String s2 = "12";
//        String res = q306.stringAdd(s1, s2);
//        System.out.println(res);
        
//        Q6 q6 = new Q6();
//        int numRows = 1;
//        String s = "L";
//        String res = q6.convert(s, numRows);
//        System.out.println(res);
//        
//        String[] words = {"What","must","be","acknowledgment","shall","be"};
//        Q68 q68 = new Q68();
//        int maxWidth = 18;
//        List<String> res = q68.fullJustify(words, maxWidth);
//        for(String s:res) {
//            System.out.println(s);
//        }
        
//        Q28 q28 = new Q28();
//        String haystack = "a";
//        String needle = "a";
//        int res = q28.strStr(haystack, needle);
//        System.out.println(res);
        
//        String s = "aabaaba";
//        Q459 q459 = new Q459();
//        boolean res = q459.repeatedSubstringPattern(s);
//        System.out.println(res);
        
//        ListNode head = new ListNode();
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
////        head.next.next.next.next = new ListNode(5);
//        Q143 q143 = new Q143();
//        q143.reorderList(head);
//        ListNode res = head;
//        while(res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }
        
//        System.out.println( (args.length == 0) ? "yday" : args[0] );
//        Q1046 q1046 = new Q1046();
//        int[] stones = {3,4,8,9,4,2,5,7,10};
////        {7,6,7,6,9} {3,4,8,9,4,2,5,7,10}
//        int res = q1046.lastStoneWeight(stones);
//        System.out.println(res);
        
        Q214 q214 = new Q214();
        String s = "aabvd";
//        System.out.println(q214.isPalindrome(s));
        String res = q214.shortestPalindrome(s);
        System.out.println(res);
    }
}
