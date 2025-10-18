package HashMap;

import java.util.Arrays;

public class Implementation {
    class MyHashMap {


        // Define the maximum key range
        private static final int SIZE = 1_000_001;
        private int[] map;

        public MyHashMap() {
            map = new int[SIZE];
            // Initialize all elements to -1 (indicating key not present)
            Arrays.fill(map, -1);
        }

        public void put(int key, int value) {
            map[key] = value;
        }

        public int get(int key) {
            return map[key];  // returns -1 if key not present
        }

        public void remove(int key) {
            map[key] = -1;  // mark as not present
        }
    }
}
