package LinkedList;


import org.w3c.dom.Node;

public class Insert_node_at_any_posi {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);

        // Insert at the beginning
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        int index = 1;

        // Traverse to the node just before the desired position
        while (current != null && index < pos - 1) {
            current = current.next;
            index++;
        }

        // Insert only if the position is valid
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }
}
