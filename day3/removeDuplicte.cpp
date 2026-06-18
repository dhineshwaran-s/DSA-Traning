#include <iostream>
#include <vector>
using namespace std;

int main() {
	// your code goes here
	    vector<int>nums={1,1,2} ;
        int n=nums.size();
        int k=1;
        if(n==0){
            cout<< 0;
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        cout<< k;
}