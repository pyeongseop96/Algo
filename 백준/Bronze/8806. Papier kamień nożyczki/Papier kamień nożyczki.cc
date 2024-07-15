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

    int N; cin >> N;
    for(int i=1; i<=N; i++){
        double a,b,c,d,e,f; cin >> a >> b >> c >> d >> e >>f;
        int aa = a*100;
        int bb = b*100;
        int cc = c*100;
        int dd = d*100;
        int ee = e*100;
        int ff = f*100;
        int aaa = (aa*ee)+(bb*ff)+(cc*dd);
        int bbb = (dd*bb)+(ee*cc)+(ff*aa);
        if(aaa>bbb){
            cout << "ADAM" << '\n';
        }
        else if(aaa<bbb){
            cout << "GOSIA" << '\n';
        }
        else{
            cout << "=" << '\n';
        }
    }
}