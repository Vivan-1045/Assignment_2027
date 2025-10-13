package Array;

public class Equillibrium_in_array {
    public int pivotIndex(int[] nums) {
        //Find the sum of whole array
        int sum = 0;
        for(int ele: nums){
            sum += ele;
        }

        //Check while traversing the half sum of array is equal
        //with curr sum or not if equal then return i+1

        int curr =0;
        for(int i=0;i<nums.length;i++){

            if(curr == (sum-curr-nums[i])){
                return i;
            }
            curr += nums[i];

        }

        return -1;
    }
}
