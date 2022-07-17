package leetcode.treequestion;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        list = zhandu(root, list);
        return list;

    }



    public List<Integer> zhandu(TreeNode root, List<Integer> arrayList)


    {
        if (root == null) return arrayList;


        arrayList.add(root.val);

        zhandu(root.left, arrayList);


        zhandu(root.right, arrayList);

        return arrayList;

    }

}