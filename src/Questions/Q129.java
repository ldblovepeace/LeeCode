package Questions;

import java.util.ArrayList;
import java.util.List;

import treeNode.TreeNode;

public class Q129 {
	public int sumNumbers(TreeNode root) {
		return reverseSum(root,0);
	}
	
	public int reverseSum(TreeNode root, int sum){
		if(root == null){
			return 0;
		} 
		int result = root.val + sum*10;
		if(root.left == null && root.right == null){
			return result;
		}else{
			return reverseSum(root.left, result) + reverseSum(root.right,result);
		}
	}
}
