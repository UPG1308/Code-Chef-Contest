#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n; cin>>n;
    unordered_map<int, int> mp;
    for(int i = 0; i < n; i++){
        int a; cin>>a; 
        mp[a]++;
    }
    if((mp.size() == 1) or (mp.size() == 2 and mp[0] != 0)) cout<<"YES\n";
    else cout<<"NO\n";
}
int main(){
    int t; cin>>t;
    while(t--) solve();
    return 0;
}