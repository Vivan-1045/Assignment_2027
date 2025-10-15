package LinkedList;

public class Remove_dup_from_sorted_list {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int n){
            this.val = n;
        }
        ListNode(int n , ListNode next){
            this.val =n;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        return removeDuplicate(head); // Call helper to remove duplicates from sorted list
    }

    ListNode removeDuplicate(ListNode temp) {
        if (temp == null) {
            return temp; // Empty list, nothing to remove
        }

        ListNode head = temp;

        // Traverse the list and skip duplicate nodes
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next; // Remove duplicate
            } else {
                temp = temp.next; // Move to next distinct node
            }
        }

        return head; // Return modified list
    }

}
