package DP;

import java.util.Arrays;

public class jump_game_ii {
    int dp[];
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        // return solve(nums,0);
        return solve(nums,0);
    }

    //dp
    int solve(int[] arr,int idx){
        if (idx>= arr.length-1){
            //each time we take miniMum of res, minCount
            return 0;
        }
        if (dp[idx] != -1){
            return dp[idx];
        }

        int minJumps = Integer.MAX_VALUE;
        for (int i = 1;i<=arr[idx];i++){
            if (idx+i<arr.length){
                int jumps = solve(arr,idx+i);
                if (jumps != Integer.MAX_VALUE){
                    minJumps = Math.min(minJumps,jumps+1);
                }
            }
        }

        return dp[idx] = minJumps;
    }
}
