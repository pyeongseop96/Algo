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
    int ans = 99999;
    int lastIdx = -1;
    int firstIdx = -1;
    int inScore = 0;
    int outScore = M;

    vector<int> in(M+1);
    vector<int> out(M+1);

    vector<int> rainbow(N);

    int tmp;
    for(int i=0; i<N; i++){
        cin >> tmp;
        rainbow[i] = tmp;
        out[tmp]++;
    }

    while(true){
        while(inScore!=M){
            lastIdx++;
            if(lastIdx>=N){
                break;
            }
            int val = rainbow[lastIdx];

            if(in[val]==0){
                inScore++;
            }
            in[val]++;

            if(out[val]==1){
                outScore--;
            }
            out[val]--;

// print(lastIdx,inScore, outScore, firstIdx, lastIdx);
            if(inScore==M && outScore==M && ans > lastIdx - firstIdx){
                ans = lastIdx - firstIdx;
            }
        }

        if(lastIdx>=N){
                break;
            }
        
        while(inScore==M){
            firstIdx++;
            // print(firstIdx,2);
            int val = rainbow[firstIdx];

            if(in[val]==1){
                inScore--;
            }
            in[val]--;

            if(out[val]==0){
                outScore++;
            }
            out[val]++;

            if(inScore==M && outScore==M && ans > lastIdx - firstIdx){
                ans = lastIdx - firstIdx;
            }
        }
    }

    if(ans==99999){
        ans = 0;
    }
    cout << ans;



}