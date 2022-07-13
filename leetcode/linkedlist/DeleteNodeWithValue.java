package leetcode.linkedlist;

public class DeleteNodeWithValue {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode test = new ListNode(0, head);
        ListNode curr = test.next;
        ListNode prev = test;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else
                prev = curr;
            curr = curr.next;
        }

        return test.next;
    }


    public static void main(String args[]) {
        System.out.println(removeElements(new ListNode(), 6));
    }
}
