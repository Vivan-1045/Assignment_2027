package LinkedList;

public class Merge_two_list {

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1, list2); // Call helper to merge two sorted lists
    }

    ListNode merge(ListNode first, ListNode second) {
        ListNode ans = new ListNode(); // Dummy node to start the merged list
        ListNode tail = ans;           // Tail to build the new list

        // Traverse both lists and attach the smaller node to the merged list
        while (first != null && second != null) {
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes from either list
        tail.next = (first != null) ? first : second;

        return ans.next; // Return head of merged list (skip dummy)
    }

}
