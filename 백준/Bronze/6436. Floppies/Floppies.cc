#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
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

    int tc = 1;
    while(true){
        int N; cin >> N;
        if(N==0){
            break;
        }
        if(tc!=1){
            cout << '\n';
        }
        cout << "File #" << tc++ << '\n';
        int M = (N*0.75)+0.5;
        int ans = M/1860000;
        if(M%1860000!=0){
            ans++;
        }
        cout << "John needs " << ans << " floppies." << '\n';
    }
}