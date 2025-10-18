package Binary_Search;

public class Search_in_rotated_sorted_array_1 {

        public int search(int[] nums, int target) {
            // Find the pivot index where the array was rotated
            int pivet = pivetSearch(nums);

            // If no pivot found, array is not rotated; perform standard binary search
            if(pivet == -1 ){
                return BinarySearch(nums , target , 0 , nums.length-1);
            }

            // If target is at the pivot
            if(nums[pivet] == target){
                return pivet;
            }

            // If target lies in the left sorted part
            else if(target >= nums[0]){
                return BinarySearch(nums, target, 0, pivet - 1);
            }

            // Otherwise, target lies in the right sorted part
            else{
                return BinarySearch(nums , target, pivet + 1, nums.length - 1);
            }
        }

        // Standard binary search between indices s and e
        int BinarySearch(int[] nums , int target, int s , int e){
            while(s <= e){
                int m = s + (e - s) / 2;
                if(target < nums[m]){
                    e = m - 1;
                }
                else if(target > nums[m]){
                    s = m + 1;
                }
                else{
                    return m; // Target found
                }
            }
            return -1; // Target not found
        }

        // Finds the index of the pivot (point of rotation)
        int pivetSearch(int[] nums){
            int s = 0;
            int e = nums.length - 1;

            while(s <= e){
                int m = s + (e - s) / 2;

                // Check if mid is the pivot
                if(e > m && nums[m] > nums[m + 1]){
                    return m;
                }
                // Check if element before mid is the pivot
                else if(m > s && nums[m] < nums[m - 1]){
                    return m - 1;
                }

                // Decide whether to search left or right half
                if(nums[m] <= nums[s]){
                    e = m - 1;
                }
                else{
                    s = m + 1;
                }
            }

            return -1; // No pivot found; array is not rotated
        }


}
