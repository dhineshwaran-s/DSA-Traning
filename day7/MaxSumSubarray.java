package day7;

public class MaxSumSubarray {

    public static int findMaxSumSubarray(int[] arr, int K) {
        int n = arr.length;
        
        // Array size K-ah vida chintha iruntha, subarray form panna mudiyathu
        if (n < K) {
            System.out.println("Invalid: Array size is smaller than K");
            return -1; 
        }

        int max_sum = 0;
        int window_sum = 0;

        // Step 1: First window-oda sum kandupudikka (Muthal K elements)
        for (int i = 0; i < K; i++) {
            window_sum += arr[i];
        }
        
        // Starting-la ithu thaan namakku maximum sum
        max_sum = window_sum;

        // Step 2: Window-va slide panrom (K-th index-la irunthu array end varikum)
        for (int i = K; i < n; i++) {
            // Puthusa window-kulla vara element-ah add panrom: arr[i]
            // Window-va vittu veliya pora palaya element-ah minus panrom: arr[i - K]
            window_sum = window_sum + arr[i] - arr[i - K];
            
            // Palaya max_sum perusa, illana puthu window_sum perusa nu check panni update panrom
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 3;

        int result = findMaxSumSubarray(arr, K);
        System.out.println("Maximum sum of a subarray of size " + K + " is: " + result);
    }
}