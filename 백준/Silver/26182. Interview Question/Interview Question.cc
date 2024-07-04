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
    int N,M; cin >> N >> M;
    string cur;
    int Fiz1 = 0;
    int Fiz2 = 0;
    int Buz1 = 0;
    int Buz2 = 0;
    for(int i=N; i<=M; i++){
        cin >> cur;
        if(cur=="Fizz"){
            if(Fiz1==0){
                Fiz1 = i;
            }
            else if(Fiz2 == 0){
                Fiz2 = i;
            }
        }
        else if(cur=="Buzz"){
            if(Buz1==0){
                Buz1 = i;
            }
            else if(Buz2 == 0){
                Buz2 = i;
            }
        }
        else if(cur=="FizzBuzz"){
            if(Fiz1==0){
                Fiz1 = i;
            }
            else if(Fiz2 == 0){
                Fiz2 = i;
            }

            if(Buz1==0){
                Buz1 = i;
            }
            else if(Buz2 == 0){
                Buz2 = i;
            }
        }
    }

    int ans1 = 987654;
    int ans2 = 987654;
    if(Fiz2!=0){
        ans1 = Fiz2-Fiz1;
    }
    else if(Fiz1!=0){
        ans1 = Fiz1;
    }

    if(Buz2!=0){
        ans2 = Buz2-Buz1;
    }
    else if(Buz1!=0){
        ans2 = Buz1;
    }

    cout << ans1 << " " << ans2 << '\n';
}