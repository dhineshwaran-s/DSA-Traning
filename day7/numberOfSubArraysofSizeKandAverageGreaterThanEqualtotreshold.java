package day7;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result=0;
        int total=threshold*k;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum>=total)
            result++;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>=total)
                result++;
        }
        return result;
    }
}











