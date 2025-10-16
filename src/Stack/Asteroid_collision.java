package Stack;

import java.util.Stack;

public class Asteroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        return asteroidAfterCollision(asteroids);
    }

    int[] asteroidAfterCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int num : arr) {
            // Handle collision: right-moving asteroid in stack vs. left-moving current asteroid
            while (!st.isEmpty() && st.peek() > 0 && num < 0) {
                int sum = st.peek() + num;

                if (sum == 0) {
                    st.pop(); // Both asteroids destroy each other
                    num = 0;
                } else if (sum < 0) {
                    st.pop(); // Stack top asteroid destroyed
                } else {
                    num = 0; // Current asteroid destroyed
                }
            }

            if (num != 0) {
                st.push(num); // Survived asteroid
            }
        }

        // Convert stack to array
        int[] ans = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            ans[i--] = st.pop();
        }

        return ans;
    }
}
