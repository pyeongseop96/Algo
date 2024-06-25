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
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int A,B; cin >> A >> B;
    vector<int>v;
    vector<int>w;
    int i=1;
    for(; i*i<A; i++){
        if(A%i==0){
            v.pb(i);
            v.pb(A/i);
        }
    }
    if(i*i==A){
        v.pb(i);
    }
    sort(all(v));

    int ii=1;
    for(; ii*ii<B; ii++){
        if(B%ii==0){
            w.pb(ii);
            w.pb(B/ii);
        }
    }
    if(ii*ii==B){
        w.pb(ii);
    }
    sort(all(w));

    for(int num:v){
        for(int numnum:w){
            print(num,numnum);
        }
    }
}
