package Questions;
import java.util.ArrayList;
import java.util.List;

import treeNode.TreeNode;

public class Q144 {
	public List<Integer> preorderTraversal(TreeNode root) {
//		递归算法
			List<Integer> l = new ArrayList<Integer>();
			if (root == null ){
				return null;
			}else{
				l.add(root.val);
				if (root.left != null){
					TreeNode left = root.left;
					l.addAll(preorderTraversal(left));
				}
				if (root.right != null){
					TreeNode right = root.right;
					l.addAll(preorderTraversal(right));
				}
				return l;
			}
		}
	
	public List<Integer> preorderTraversal1(TreeNode root) {
//		迭代算法；暂未实现
			List<Integer> l = new ArrayList<Integer>();
			if (root == null ){
				return null;
			}else{
				return l;
			}
		}
}
