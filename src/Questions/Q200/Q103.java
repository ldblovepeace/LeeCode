package Questions.Q200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.TreeNode;

public class Q103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = zigzagLevelOrderByHeight(root, 0);
        for(int i=0; i<res.size(); i++) {
            if(i%2 == 1) {
                List<Integer> l = new ArrayList<>();
                List<Integer> l1 = res.get(i);
                for(int j=l1.size() - 1; j>=0; j--) {
                    l.add(l1.get(j));
                }
                res.get(i).removeAll(l1);
                res.set(i, l);
            }
        }
        return res;
    }
    
    public Map<Integer,List<Integer>> zigzagLevelOrder(TreeNode root, int location) {
        Map<Integer,List<Integer>> res = new HashMap<>();
        TreeNode index = root;
        

        if(root.left == null && root.right == null) {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            res.put(location,l);
            return res;
        }
        location = location << 2;
        if(index.left != null){
            location = location ^ 0b10;
            TreeNode left = root.left;
            Map<Integer, List<Integer>> leftRes = zigzagLevelOrder(left, location);
            res.putAll(leftRes);
        }
        if(index.right != null) {
            location = location ^ 1;
            TreeNode right = root.right;
            Map<Integer, List<Integer>> rightRes = zigzagLevelOrder(right, location);
            res.putAll(rightRes);
        }
        
        return res;
    }
    
    
    public List<List<Integer>>  zigzagLevelOrderByHeight(TreeNode root, int height) {
        List<List<Integer>>  res = new ArrayList<>();
        int n = height;
        
        
        while(n > 0) {
            List<Integer> l = new ArrayList<>();
            res.add(l);
            n--;
        }
           
        
        if(root.left == null && root.right == null) {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            res.add(l);
            return res;
        }else {
            List<Integer> lroot = new ArrayList<>();
            lroot.add(root.val);
            res.add(lroot);
        }
        
        height++;
        if(root.left != null) {
            TreeNode left = root.left;
            List<List<Integer>> leftRes = zigzagLevelOrderByHeight(left, height);
            n = leftRes.size() - res.size();
            while(n > 0) {
                List<Integer> l = new ArrayList<>();
                res.add(l);
                n--;
            }
            for(int i=0 ;i < leftRes.size(); i++) {
                if(!leftRes.get(i).isEmpty()) {
                    res.get(i).addAll(leftRes.get(i));
                }
            }
            
        }
        if(root.right != null) {
            TreeNode right = root.right;
            List<List<Integer>> rightRes = zigzagLevelOrderByHeight(right, height);
            n = rightRes.size() - res.size();
            while(n > 0) {
                List<Integer> l = new ArrayList<>();
                res.add(l);
                n--;
            }
            for(int i=0 ;i < rightRes.size(); i++) {
                if(!rightRes.get(i).isEmpty()) {
                    res.get(i).addAll(rightRes.get(i));
                }
            }
        }
        
        return res;
    }
}
