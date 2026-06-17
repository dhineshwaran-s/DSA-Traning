#include<iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int sum=0;
    while(n>0) {
        int b=n%10;
        sum+=b;
        n/=10;
    }
    cout<<sum;
}
