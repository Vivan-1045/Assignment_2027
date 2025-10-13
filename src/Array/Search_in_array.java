package Array;

public class Search_in_array {
    public int search(int arr[], int x) {
        // code here

        //Traverse the array if element matches then just return index
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }

        //Otherwise return -1
        return -1;
    }
}
