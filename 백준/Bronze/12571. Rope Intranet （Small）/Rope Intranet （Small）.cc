#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
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
    int a,b,c,d; cin >> a >> b >> c >> d;
    if(N==1){
        print(0); 
        return;
    }
    if((a>c&&b>d)||(a<c&&b<d)){
        print(0);
    }
    else{
        print(1);
    }
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int T; cin >> T;
    // while(T--){
    //     solve();
    // }

    for(int tc=1; tc<=T; tc++){
        cout << "Case #" << tc << ": ";
        int N; cin >> N;
        int a,b; cin >> a >> b;
        if(N==1){
            print(0); 
        }
        else{
            int c,d; cin >> c >> d;
            if((a>c&&b>d)||(a<c&&b<d)){
            print(0);
            }
            else{
                print(1);
            }
        }

    }
}
