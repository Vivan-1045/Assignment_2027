package Array;

import java.util.HashSet;
import java.util.Set;

public class first_repeated {
    public static int firstRepeated(int[] arr) {
        // code here
        Set<Integer> st = new HashSet<>();

        int minIdx = -1;

        for(int i = arr.length-1;i>=0;i--){
            if(st.contains(arr[i])){
                minIdx = i+1;
            }else{
                st.add(arr[i]);
            }
        }

        return minIdx;
    }
}
