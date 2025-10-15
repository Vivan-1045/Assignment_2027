package LinkedList;

public class Add_two_number {

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNumbers(l1, l2); // Call helper to add two numbers represented by linked lists
    }

    ListNode addNumbers(ListNode h1, ListNode h2) {
        ListNode ans = new ListNode(0); // Dummy node to build result list
        ListNode dummy = ans;
        ListNode temp1 = h1;
        ListNode temp2 = h2;
        int carry = 0;

        // Add corresponding digits from both lists
        while (temp1 != null && temp2 != null) {
            int sum = temp1.val + temp2.val + carry;
            int value = sum % 10;
            carry = sum / 10;
            dummy.next = new ListNode(value);
            dummy = dummy.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // Process remaining digits in first list
        while (temp1 != null) {
            int sum = temp1.val + carry;
            int value = sum % 10;
            carry = sum / 10;
            dummy.next = new ListNode(value);
            dummy = dummy.next;
            temp1 = temp1.next;
        }

        // Process remaining digits in second list
        while (temp2 != null) {
            int sum = temp2.val + carry;
            int value = sum % 10;
            carry = sum / 10;
            dummy.next = new ListNode(value);
            dummy = dummy.next;
            temp2 = temp2.next;
        }

        // Add final carry if exists
        if (carry != 0) {
            dummy.next = new ListNode(carry);
        }

        return ans.next; // Return head of the result list
    }

}
