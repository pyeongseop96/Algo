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
    
    
    string str1; cin >> str1;
    string str2; cin >> str2;
    int a1,a2,b1,b2;
    for(int i=0; i<str1.length(); i++){
        if(str1[i]=='|'){
            a1 = i;
            a2 = str1.length() - i - 1;
        }
    }

    for(int i=0; i<str1.length(); i++){
        if(str1[i]=='|'){
            a1 = i;
            a2 = str1.length() - i - 1;
            break;
        }
    }

    for(int i=0; i<str2.length(); i++){
        if(str2[i]=='|'){
            b1 = i;
            b2 = str2.length() - i - 1;
        }
    }

    if(a1==b1 || a1==b2 || a2==b1 || a2==b2){
        print("Yes");
    }
    else{
        print("No");
    }
}