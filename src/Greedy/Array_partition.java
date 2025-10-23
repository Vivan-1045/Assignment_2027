package Greedy;

import java.util.Arrays;

public class Array_partition {
    public int arrayPairSum(int[] nums) {
        return arrayPair(nums);
    }

    int arrayPair(int[] arr){
        //Simply sort the array
        Arrays.sort(arr);

        int res = 0;

        //loop and add every 2nd element;
        for(int i = 0;i<arr.length;i+=2){
            res += arr[i];
        }

        return res;
    }
}
