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
    int N; cin >> N;
    vector<int> f(N);
    for(int i=N-1; i>=0; i--){
        cin >> f[i];
    }

    int M; cin >> M;
    vector<int> g(M);
    for(int i=M-1; i>=0; i--){
        cin >> g[i];
    }

    int O; cin >> O;
    vector<int> h(O);
    for(int i=O-1; i>=0; i--){
        cin >> h[i];
    }

    vector<int> k(N+M);
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            k[i+j] ^= f[i]*g[j];
        }
    }

    vector<int> ans;
    
    int idx = N+M-1;
    while(idx>=0){
        if(k[idx]==1){
            if(idx>=O-1){
                for(int i=0; i<O; i++){
                    k[idx-i] ^= h[O-1-i];
                }
            }
            else{
                break;
            }
        }
        idx--;
    }
    bool one = false;
    for(int i=N+M-1; i>=0; i--){
        if(one){
            ans.pb(k[i]);
        }
        else{
            if(k[i]==1){
                one = true;
                ans.pb(k[i]);
            }
        }
    }
    cout << ans.size() << " ";
    for(int num : ans){
        cout << num << " ";
    }
    cout << '\n';
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
     int T; cin >> T;
     while(T--){
         solve();
     }  
}