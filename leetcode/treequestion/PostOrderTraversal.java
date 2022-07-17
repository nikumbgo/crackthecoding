package leetcode.treequestion;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        list = zhandu(root, list);
        return list;

    }



    public List<Integer> zhandu(TreeNode root, List<Integer> arrayList)


    {
        if (root == null) return arrayList;



        zhandu(root.left, arrayList);


        zhandu(root.right, arrayList);
        arrayList.add(root.val);
        return arrayList;

    }

}
