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
    int x,y; cin >> x >> y;
    if(x<=23 && y<=59){
        cout << "Yes";
    }
    else{
        cout << "No";
    }
    cout << " ";
    if(y>=1 && y<=31){
        if(x>=1 && x<=12 && y<=29){
            cout<<"Yes";
        }
        else if(x>=1 && x<=12 && x!=2 && y<=30){
            cout << "Yes";
        }
        else if((x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12) &&y<=31){
            cout << "Yes";
        }
        else{
            cout << "No";
        }
    }
    else{
        cout << "No";
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