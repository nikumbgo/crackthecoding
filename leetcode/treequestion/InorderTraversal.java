package leetcode.treequestion;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        list = zhandu(root,list);
        return list;

    }

    public List<Integer>zhandu(TreeNode root,List<Integer> arrayList)
    {
        if(root == null) return arrayList;


        zhandu(root.left,arrayList);
        arrayList.add(root.val);

        zhandu(root.right,arrayList);
        return arrayList;

    }
}