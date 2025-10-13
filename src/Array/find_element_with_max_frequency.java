package Array;

import java.util.*;

public class find_element_with_max_frequency {
    public int maxFrequencyElements(int[] nums) {
        return maxFreq(nums);
    }
    int maxFreq(int[]arr){
        Map<Integer,Integer> mp = new HashMap<>();

        //Store the frequency of each element in the map
        for(int ele : arr){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }

        //Store map values in map
        List<Integer> ls = new ArrayList<>();
        for(int val : mp.values()){
            ls.add(val);
        }

        //Sort the list
        Collections.sort(ls);

        //Logic to get the sum
        for(int i = ls.size()-1;i>=0;i--){
            int sum = ls.get(i);
            for(int j = i-1;j>=0;j--){
                if(ls.get(i)==ls.get(j)){
                    sum+= ls.get(j);
                }else{
                    break;
                }
            }
            return sum;
        }

        return 0;
    }
}
