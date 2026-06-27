package day9;

class Solution {
    
    public int findKRotation(int arr[]) {
        // Code here
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right])
               left=mid+1;
            else
               right=mid;
        }
        return left;
    }
}