package day8;

public class MinimumSizeSubarray {
    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                mini=Math.min(mini,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(mini==Integer.MAX_VALUE){
            return 0;
        }
        else
           return mini;
    }
}
}
