package Questions.Q300;

import common.TreeNode;

public class Q222 {
    public int countNodes1(TreeNode root) {
        int res = 0;
                
        if(root == null) {
            return 0;
        }
        
        if(root.left == null && root.right == null) {
            return 1;
        }
        
        if(root.left != null && root.right == null) {
            return 2;
        }
        
        TreeNode rightNode = root.right;
        TreeNode leftNode = root.left;
        
        res =1 + countNodes1(leftNode) + countNodes1(rightNode); 
        
        return res;
        
    }
    
    public int countNodes2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int res = 1;
        
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        
        if(leftDepth == rightDepth) {
            for(int i = 0; i< leftDepth; i++) {
                res = res + (int)Math.pow(2,i);
            }
            
            res = res + countNodes2(root.right);
        }
        
        if(leftDepth != rightDepth) {
            for(int i = 0; i< rightDepth; i++) {
                res = res + (int)Math.pow(2,i);
            }
            res = res + countNodes2(root.left);
        }
        
        return res;
    }
    
    public int getDepth(TreeNode root) {
        int depth = 1;
        if(root == null) {
            return 0;
        }
        while(root.left!= null) {
            root = root.left;
            depth ++;
        }
        
        return depth;
    }
}
