package leetcode.linkedlist;

public class ContainsCycle {

   static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }


    public static void main(String[] args) {
System.out.println(hasCycle(new ListNode(10)));
    }

    public static boolean hasCycle(ListNode head) {


        ListNode fast = head;
        if (head == null || head.next == null)
            return false;

        while (head.next.next != null) {
            head = head.next;
            if (fast == null || fast.next == null || fast.next.next == null)
                return false;
            fast = fast.next.next;
            if (head != null && fast != null && head.val == fast.val && head.next == fast.next)
                return true;


        }

        return false;
    }
}
