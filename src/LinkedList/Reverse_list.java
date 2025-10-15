package LinkedList;

public class Reverse_list {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head; // No nodes to reverse
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        // Reverse links one by one
        while (pres != null) {
            pres.next = prev;    // Point current node to previous
            prev = pres;         // Move prev forward
            pres = next;         // Move current forward
            if (next != null) {
                next = next.next; // Advance next
            }
        }

        return prev; // New head of the reversed list
    }
}
