#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;
typedef pair<int,int> pii;
#define pb push_back
#define all(a) a.begin(), a.end()

#define dbg(...) cerr << "#" << __LINE__ << ' ' << #__VA_ARGS__ << "- ", debug_print(__VA_ARGS__)
template<typename T> void debug_print(vector<T> x){for(auto i: x) cerr << i << ' ';cerr << "\n";}
template<typename T> void debug_print(set<T> x){for(auto i: x) cerr << i << ' ';cerr << "\n";}
template<typename T> void debug_print(unordered_set<T> x){for(auto i: x) cerr << i << ' ';cerr << "\n";}
template<typename T> void debug_print(T && x) {cerr << x << endl;}
template<typename T, typename ...S> void debug_print(T && x, S&&...y) {cerr << x << ", "; debug_print(y...);}
 
template<typename T> void print(vector<T> x){for(auto i: x) cout << i << ' ';cout << "\n";}
template<typename T> void print(set<T> x){for(auto i: x) cout << i << ' ';cout << "\n";}
template<typename T> void print(unordered_set<T> x){for(auto i: x) cout << i << ' ';cout << "\n";}
template<typename T> void print(T && x) {cout << x << "\n";}
template<typename T, typename... S> void print(T && x, S&&... y) {cout << x << ' ';print(y...);}

void solve() {
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    //  int T; cin >> T;
    //  while(T--){
    //      solve();
    //  }
    
    vector<bool> sosu(1000001);
    sosu[0] = true;
    sosu[1] = true;
    for(int i=1; i<=1000; i++){
        if(!sosu[i]){
            int j = i*2;
            for(;j<=1000000; j+=i){
                sosu[j] = true;
            }
        }
    }
    vector<int> v;
    for(int i=2; i<=1000000; i++){
        if(!sosu[i]){
            v.pb(i);
        }
    }
   int N; cin >> N;
   for(int i=1; i<=N; i++){
    int num; cin >> num;
    int start = 0;
    int end = v.size()-1;
    int ans = 0;
    while(start <= end){
        if(v[start]+v[end]<num){
            start++;
        }
        else if(v[start]+v[end]>num){
            end--;
        }
        else{
            ans++;
            start++;
            end--;
        }
    }
    cout << ans << '\n';
   }
}