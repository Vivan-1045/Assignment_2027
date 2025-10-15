package LinkedList;

public class delete_node_from_given_posi {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        // Shift values from the next nodes forward until the end
        while (node.next != null) {
            int temp = node.next.val;
            node.next.val = node.val;
            node.val = temp;

            // If next node is the last, remove it
            if (node.next.next == null) {
                node.next = null;
                break;
            }

            node = node.next;
        }
    }

}
