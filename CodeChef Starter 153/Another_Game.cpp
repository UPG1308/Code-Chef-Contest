#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n; cin>>n;
    map<int, int> mp;
    vector<int> arr(n);
    for(int i = 0; i < n; ++i){
        cin>>arr[i];
        mp[arr[i]] = i;
    }
    long long minK = 0;
    bool isSorted = true;
    for(int i = 0; i < n; ++i){
        if(arr[i] == (i + 1)) continue;
        minK = max(minK * 1ll, arr[i] + 1 * 1ll);
        isSorted = false;
    }
    if(isSorted) cout<<"0\n";
    else cout<<minK<<"\n";
}
int main(){
    int t; cin>>t;
    while(t--) solve();
    return 0;
}