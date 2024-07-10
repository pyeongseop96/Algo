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
    
    while(true){
        string str1, str2; cin >> str1 >> str2;
        if(str1=="00:00" && str2=="00:00"){
            break;
        }
        ll h = ((str1[0]-'0')*10) + 
        ((str1[1]-'0')*1) + 
        ((str2[0]-'0')*10) + 
        ((str2[1]-'0')*1);

        ll m = ((str1[3]-'0')*10) + 
        ((str1[4]-'0')*1) + 
        ((str2[3]-'0')*10) + 
        ((str2[4]-'0')*1);

        ll sum = (h*60)+m;

        int plus = 0;
        while(sum >= 24*60){
            plus++;
            sum -= 24*60;
        }
        int newH = sum/60;
        sum -= newH * 60;
        if(newH<10){
            cout << "0";
        }
        cout << newH << ":";
        if(sum<10){
            cout << "0";
        }
        cout << sum;
        if(plus!=0){
            cout << " +" << plus;
        }
        cout << '\n';
    }

}