class Solution {
  public:
    void sort012(vector<int>& arr) {
        // code here
        int n=arr.size();
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else if(arr[i]==2){
                c2++;
            }
        }
        int index=0;
        for(int i=0;i<c0;i++){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<c1;i++){
            arr[index]=1;
            index++;
        }
        for(int i=0;i<c2;i++){
            arr[index]=2;
            index++;
        }
        
    }
    int main() {
        vector<int> arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        for (int i = 0; i < arr.size(); i++) {
            cout << arr[i] << " ";
        }
        return 0;
    }
};