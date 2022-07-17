package leetcode.treequestion;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return zhandu(root,0);
    }
    public int zhandu(TreeNode root,int l)
    {
        if(root == null)
            return l;

        return Math.max(zhandu(root.left,l+1),zhandu(root.right,l+1));


    }
}
