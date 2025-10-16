package Queue;

public class Implement_circuler_queue {
    class MyCircularQueue {

        int queue[];
        int front;
        int rear;
        int n;

        public MyCircularQueue(int k) {
            n = k;
            queue = new int[n];
            front = rear = -1; // Initialize empty state
        }

        public boolean enQueue(int value) {
            // Queue is full
            if ((rear + 1) % n == front) return false;

            // First element to insert
            if (rear == -1) {
                front++;
                rear++;
            } else {
                rear = (rear + 1) % n; // Move rear in circular way
            }

            queue[rear] = value;
            return true;
        }

        public boolean deQueue() {
            // Queue is empty
            if (front == -1) return false;

            // Only one element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % n; // Move front in circular way
            }

            return true;
        }

        public int Front() {
            if (front == -1) return -1; // Queue is empty
            return queue[front];
        }

        public int Rear() {
            if (rear == -1) return -1; // Queue is empty
            return queue[rear];
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % n == front;
        }
    }

}
