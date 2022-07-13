package leetcode.linkedlist;

public class MergeSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String args[])
    {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode test = new ListNode(0);
        ListNode  prev= test;
        ListNode curr = new ListNode();

        while(list1 != null || list2 != null )
        {
            if(list1 == null )
            {curr = list2;
                list2 = list2.next;
            }
            else if(list2 == null )
            {curr = list1;
                list1 = list1.next;
            }else{
                if(list1.val>list2.val)
                { curr = list2;
                    list2 = list2.next;}
                else
                { curr = list1;
                    list1 = list1.next;  }
            }

            prev.next = curr;
            prev = curr;

        }


        return test.next;




    }



}

  /*  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // At least one of l1 and l2 can still have nodes at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }*/