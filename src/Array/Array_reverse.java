package Array;

public class Array_reverse {
    public void reverseArray(int arr[]) {

        int i = 0;
        int n = arr.length;

        //Traverse till mid of array and swap each element with (n-i-1) element from last
        while(i<n/2){

            //Swap logic
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i++;
        }
    }
}
