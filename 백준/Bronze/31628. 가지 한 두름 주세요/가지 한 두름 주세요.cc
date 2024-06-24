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
    vector<vector<string>>vvs(10,vector<string>(10));
    string str;
    for(int i=0; i<10; i++){
        for(int j=0; j<10; j++){
            cin >> str;
            vvs[i][j] = str;
        }
    }
    int ans = 0;
    for(int i=0; i<10; i++){
        bool cur = true;
        for(int j=1; j<10; j++){
            if(vvs[i][j]!=vvs[i][j-1]){
                cur = false;
                break;
            }
        }
        if(cur){
            ans = 1;
            break;
        }
    }

    for(int i=0; i<10; i++){
        bool cur = true;
        for(int j=1; j<10; j++){
            if(vvs[j][i]!=vvs[j-1][i]){
                cur = false;
                break;
            }
        }
        if(cur){
            ans = 1;
            break;
        }
    }

    print(ans);
}
