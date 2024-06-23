#include <bits/stdc++.h>
using namespace std;

#define ll long long

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
    ios::sync_with_stdio(false);
    cin.tie(0);
    // int T = 1;
    // cin >> T;
    // while (T--) solve();

    double a,b; cin >> a >> b;
    double big = max(a,b);
    double small = min(a,b);
    double one = min(small, big/3);
    double two = small/2;
    print(max(one, two));
}
