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

string make(ll N){
    ll check = 10;
    int num = 1;
    while(N>=check){
        num++;
        check *= 10;
    }
    string str = "";
    for(int i=1; i<=18-num; i++){
        str += "0";
    }
    str += to_string(N);
    return str;
}

void solve() {
    ll N; cin >> N;
    int floor = 1;
    ll check = 2;
    while(N>=check){
        floor++;
        check *= 2;
    }
    N = N - (check/2) + 1;
    for(int i=floor; i>=1; i--){
        cout << i;
        string str = make(N);
        cout << str << '\n';
        N = ((N-1)/2)+1;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int T = 1;
    cin >> T;
    while (T--) solve();
}
