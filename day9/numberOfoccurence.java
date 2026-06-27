package day9;
    class numberOfOccurence {
    int lower(int[] arr,int target){
        int res=arr.length;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                res=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
    int upper(int[] arr,int target){
        int res=arr.length;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){
                res=mid;
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return res;
    }
    int countFreq(int[] arr, int target) {
        // code here
        return upper(arr,target)-lower(arr,target);
    }
}


