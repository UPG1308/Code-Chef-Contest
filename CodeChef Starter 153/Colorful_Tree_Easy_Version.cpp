#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n; cin>>n;
    vector<int> adj[n + 1];
    for(int i = 0; i < n - 1; ++i){
        int u, v; cin>>u>>v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    int leaves = 0;
    for(int i = 1; i <= n; ++i){
        if(adj[i].size() == 1) leaves++;
    }
    cout<<(leaves * 3 + (n - leaves) * 2)<<"\n";
}
int main(){
    int t; cin>>t;
    while(t--) solve();
    return 0;
}