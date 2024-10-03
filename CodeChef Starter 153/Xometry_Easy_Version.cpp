#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll cnt[2000005];

int main() {
	ll tt=1;
    cin>>tt;
    while(tt--){
        ll n;
        cin>>n;
        ll a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        ll ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans+=8*cnt[a[i]^a[j]];
                cnt[a[i]^a[j]]++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                cnt[a[i]^a[j]]=0;
            }
        }
        cout<<ans<<"\n";
    }
}