#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n; cin>>n;
    string s; cin>>s;
    if(n == 1 and s[0] == '0') cout<<"1\n";
    else if(s[0] == '1' and s[n - 1] == '1') cout<<"0\n";
    else if(s[0] != s[n - 1]) cout<<"1\n";
    else cout<<"2\n";
}
int main(){
    int t; cin>>t;
    while(t--) solve();
    return 0;
}