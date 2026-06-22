package day7;

public class maximumAverageOfSubarray {
        class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int sum=0;
            for(int i=0;i<k;i++){
                sum=sum+nums[i];
            }
            double max=sum;
            for(int i=k;i<nums.length;i++){
                sum=sum+nums[i]-nums[i-k];
                max=Math.max(max,sum);
            }
            double result=max/k;
            return result;
        }
    }
}
