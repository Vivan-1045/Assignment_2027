package Array;

public class Running_sum {
    public int[] runningSum(int[] nums) {
        return runSum(nums);
    }

    int [] runSum(int[] arr){

        //Logic is simple just compute the prefix sum array (Prefix array)
        for(int i = 1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
}
