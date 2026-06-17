#include <iostream>
#include <vector>
using namespace std;

int main() {
    int target = 9;
    vector<int> num = {2, 5, 3, 7, 11};
    
    // Step 1: Original index ah miss panna koodathu nu oru pair vector create panrom
    // Format: pair<number, original_index>
    vector<pair<int, int>> numWithIndices;
    for(int i = 0; i < num.size(); i++) {
        numWithIndices.push_back({num[i], i});
    }
    
    // Step 2: Array ah sort panrom (chinna number la irunthu periya number)
    sort(numWithIndices.begin(), numWithIndices.end());
    // Ippo array ipadi aagidum: { {2,0}, {3,2}, {5,1}, {7,3}, {11,4} }
    
    // Step 3: Two-Pointer method start panrom
    int left = 0;                              // Starting pointer
    int right = numWithIndices.size() - 1;     // Ending pointer
    
    while(left < right) {
        int sum = numWithIndices[left].first + numWithIndices[right].first;
        
        if(sum == target) {
            // Target kedaichiduchu! Original indices ah print panrom
            cout << numWithIndices[left].second << " " << numWithIndices[right].second;
            break;
        } 
        else if(sum < target) {
            // Sum romba chinna tha irukku, so left pointer ah right la move panna periya number kedaikum
            left++;
        } 
        else {
            // Sum romba perisa irukku, so right pointer ah left la move panna chinna number kedaikum
            right--;
        }
    }
    
    cout << " ";
    return 0;
}