package Array;

public class Remove_duplicate_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        return removeDup(nums);
    }
    int removeDup(int[] arr){
        int i = 0;

        //Traverse on array compare each adjacent element
        for(int j = 1;j<arr.length;j++){

            //If element are not same then store the element at ith index
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }


        // Return idx+1 length which the actual length
        return i+1;
    }
}
