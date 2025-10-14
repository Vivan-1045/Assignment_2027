package Recurrsion;

public class Tower_of_hanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Base case: only one disk, takes one move
        if (n == 1) {
            return 1;
        }

        // Move (n-1) disks from 'from' to 'aux' using 'to' as helper
        int moves = towerOfHanoi(n - 1, from, aux, to);

        // Move the largest disk from 'from' to 'to'
        moves++;

        // Move (n-1) disks from 'aux' to 'to' using 'from' as helper
        moves += towerOfHanoi(n - 1, aux, to, from);

        // Return total moves
        return moves;
    }

}
