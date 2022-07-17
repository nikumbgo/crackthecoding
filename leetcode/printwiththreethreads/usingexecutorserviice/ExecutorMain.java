package threadtest.printwiththreethreads.usingexecutorserviice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {

    public static void main(String arg[])
    {
        ExecutorService exService = Executors.newFixedThreadPool(10);

     /*   exService.invokeAll(()->{
            System.out.println(Thread.currentThread().getName());
        });
*/
        /*exService.submit(()->{
   System.out.println(Thread.currentThread().getName());
});*/
    }
}

/**
 *
 *
 *
 * /**
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode() {}
 *  *     TreeNode(int val) { this.val = val; }
 *  *     TreeNode(int val, TreeNode left, TreeNode right) {
 *  *         this.val = val;
 *  *         this.left = left;
 *  *         this.right = right;
 *  *     }
 *  * }
 *  */
 /**

class Solution {
 *

    public List<Integer> inorderTraversal(TreeNode root) {
 *List<Integer> list = new ArrayList<>();
 *
 *list = zhandu(root, list);
 *return list;
 *
 *}
 *
         *

    public List<Integer> zhandu(TreeNode root, List<Integer> arrayList)
 *

    {
 *if (root == null) return arrayList;
 *
 *
 *if (root.left != null)
 *{
        zhandu(root.left, arrayList);
    }
 *arrayList.add(root.val);
 *
 *zhandu(root.right, arrayList);
 *return arrayList;
 *
 *}
 *
}
 */
