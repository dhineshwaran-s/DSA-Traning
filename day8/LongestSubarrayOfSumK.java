package day8;

import java.util.HashMap;

public class LongestSubarrayOfSumK {
    public static class Solution {
        public int longestSubarray(int[] arr, int k) {
            // HashMap to store (prefix_sum, index)
            HashMap<Integer, Integer> map = new HashMap<>();

            int sum = 0;
            int maxLength = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i]; // add current element to sum

                // If current sum equals k, update maxLength
                if (sum == k) {
                    maxLength = Math.max(maxLength, i + 1);
                }

                // If (sum - k) seen before, update maxLength
                int rem = sum - k;
                if (map.containsKey(rem)) {
                    int len = i - map.get(rem);
                    maxLength = Math.max(maxLength, len);
                }

                // Store current sum index if first time
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }

            return maxLength;
        }
    }
}
