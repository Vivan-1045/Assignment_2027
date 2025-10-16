package Queue;

import java.util.Stack;

public class queue_using_stack {
    Stack<Integer> st1; // Main stack for input
    Stack<Integer> st2; // Temporary stack for reversing order

    public void MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x); // Always push to st1
    }

    public int pop() {
        // Move all elements to st2 to access front
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        int removed = st2.pop(); // Front of queue

        // Move elements back to st1
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        return removed;
    }

    public int peek() {
        // Move all elements to st2 to access front
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        int peek = st2.peek(); // Front of queue

        // Move elements back to st1
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        return peek;
    }

    public boolean empty() {
        return st1.isEmpty(); // Queue is empty if st1 is empty
    }
}
