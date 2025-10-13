package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class find_min_max {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Traverse to find the max and min element
        for(int ele : arr){
            min = Math.min(min,ele);
            max = Math.max(max,ele);
        }

        //Return the new arrayList with min max element
        return new ArrayList<>(Arrays.asList(min,max));
    }
}
