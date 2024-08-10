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
    
    ll all = 0;
    ll sum = 0;
    map<int,bool> m;
    int a,b; cin >> a >> b;
    vector<vector<int>> vv(a);
    for(int i=0; i<a; i++){
        int big = 0;
        for(int j=0; j<b; j++){
            int cur; cin >> cur;
            all += cur;
            if(big<cur){
                big = cur;
            }
            vv[i].pb(cur);
        }
        sum += big;
        m[big] = true;
    }
    for(int i=0; i<b; i++){
        int big = 0;
        for(int j=0; j<a; j++){
            if(big<vv[j][i]){
                big = vv[j][i];
            }
        }
        
        if(!m[big]){
            sum += big;
        }
    }
    cout << all - sum;
}