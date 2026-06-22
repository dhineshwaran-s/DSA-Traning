#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    vector<int> prefixSum(n);
    prefixSum[0] = arr[0];
    for(int i=1;i<n;i++){
        prefixSum[i] = prefixSum[i-1] + arr[i];
    }
    for(int i=0;i<n;i++){
        cout<<prefixSum[i]<<" ";
    }
    return 0;
}
/*
Oru Chinnna Example (Dry Run):
Input ippadi irukku nu vachipom:n = 3arr = [2, 4, 6]
Code eppadi run aagum:prefixSum[0] = arr[0] $\rightarrow$ 2
i = 1: prefixSum[1] = prefixSum[0] + arr[1] 
 $\rightarrow$ 2 + 4 = 6
 i = 2: prefixSum[2] = prefixSum[1] + arr[2] 
 $\rightarrow$ 6 + 6 = 12
 Final Output: 2 6 12
*/


/*
#include <bits/stdc++.h>
using namespace std;

int sum(vector<int>&arr,int start,int end){
     int sum=0;
     for(int i=start;i<=end;i++){
         sum=sum+arr[i];
     }
     return sum;
}

int main() {
	// your code goes here
	int q;
	cin>>q;
	vector<int>arr={1,2,3,4,5,-2,-3,0,1};
	while(q--){
	    int start,end;
	    cin>>start>>end;
	    int result=sum(arr,start,end);
	    cout<<result<<"\n";
	}

}


another optimal soln

#include <iostream>
#include <vector>

using namespace std;

// 1. Prefix Sum Array-va create pandrathukana function
// '&' use pandrom so that array copy aagama, direct-a memory-la update aagum
void buildPrefixSum(const vector<int>& arr, vector<long long>& prefixSum, int n) {
    for (int i = 1; i <= n; i++) {
        // Formula: P[i] = P[i-1] + A[i]
        prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
}

// 2. O(1) time-la range sum kandupudikurathukana function
long long getRangeSum(const vector<long long>& prefixSum, int L, int R) {
    // Prefix sum formula for range [L, R]
    return prefixSum[R] - prefixSum[L - 1];
}

int main() {
    // Fast I/O
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    // 1-based indexing-kaga n+1 size
    vector<int> arr(n + 1, 0);
    vector<long long> prefixSum(n + 1, 0);

    // Array elements input vaangurom
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
    }

    // Function call panni Prefix Sum array-va ready pandrom
    buildPrefixSum(arr, prefixSum, n);

    int q;
    cin >> q;

    // Queries-a process pandrom
    while (q--) {
        int start, end;
        cin >> start >> end;
        
        // Function call panni output kondu varom
        cout << getRangeSum(prefixSum, start, end) << "\n";
    }

    return 0;
}

tutor solution 

#include <bits/stdc++.h>
using namespace std;

const int N = 100000;
vector<int> prefix(100000, 0);

int calculatePrefixSum(int start, int end, int n){
    // start = l, end = r
    int output = -1;
   if(end < n && start >= 0){
    output = prefix[end] - prefix[start - 1];
   }
    return output;
}

void build(vector<int>& arr, int n){
    // array elements stored in arr
    prefix[0] = arr[0];
   
    for(int i = 1; i < n; i++){
        prefix[i] = prefix[i - 1] + arr[i];
    }
    cout << "prefi"
}

int main(){
   

    // we have to build the prefixSum array only once
    int n;
    cout << "Enter n:" << endl;
    cin >> n;
    cout << "Enter array elements: " << endl;
    vector<int> arr(n, 0);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    // build the prefix sum array
    build(arr, n);


    int q;
    // take queries input
    cout << "Enter q " << endl;
    cin >> q;
    while(q--){
        // start and end (range of the query)
        int start, end;
        cout << "Start " << " " << "end" << endl;
        cin >> start >> end;
        int ans = calculatePrefixSum(start, end, n);
        cout << "query: " << q << " " << ans << endl;
    }

}

*/