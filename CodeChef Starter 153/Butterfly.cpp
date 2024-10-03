#include <bits/stdc++.h>
using namespace std;

void solve(){
    int r, g, b; cin>>r>>g>>b;
    if(r > (b + g) || b > (r + g) || g > (r + b)) cout<<"NO\n";
    else cout<<"YES\n";
}

int main(){
    int t; cin>>t;
    while(t--) solve();
    return 0;
}