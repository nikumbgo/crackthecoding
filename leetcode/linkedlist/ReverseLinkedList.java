package leetcode.linkedlist;

import java.util.stream.IntStream;

public class ReverseLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String args[])
    {
         ListNode node =null;
         ListNode prev = new ListNode(1);
ListNode head = prev;
        for(int i=2;i<=10;i++)
        {
            node = new ListNode(i);
            prev.next = node;
            prev = prev.next;
        }
        ListNode rverse = reverseList(head);
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }

        //ListNode rverse = reverseList(head);
        while(rverse != null)
        {
            System.out.println(rverse.val);
            rverse = rverse.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reverse  = null;

        ListNode curr = head;
        while(curr != null)
        {
            if(reverse == null) {
                reverse = curr;
                head = curr;
            }
            else
            {
                head = curr;
                head.next = reverse;
                reverse = head;

            }

            curr = curr.next;
        }

        return reverse;
    }
}
