#include <bits/stdc++.h>
using namespace std;

using ll = long long;

#define precision(x) cout<<fixed;cout.precision(x);
#define all(a) begin(a), end(a)

/* 보석함
 * cout << (s.find("fgg") == string::npos) << endl;
 * ceil, round, floor, sqrt
 * multiset<string> ss;
    cout << *s.rbegin() << endl;
 */

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int N; cin >> N;
    vector<vector<int>> v(N, vector<int>(5, 0));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < 5; j++) {
            cin >> v[i][j];
        }
    }

    int ans = 0;
    int sum = 0;
    for (int i = 0; i < N; i++) {
        vector<int> tmp(N,0);
        for (int k=0; k<N; k++) {
            for (int j = 0; j < 5; j++) {
                if (v[i][j] == v[k][j]) {
                    tmp[k]=1;
                }
            }
        }
        int cur = 0;
        for (int j=0; j<N; j++) {
            cur += tmp[j];
        }
        if (cur > sum) {
            sum = cur;
            ans = i;
        }
    }
    cout << ans+1 << endl;
    return 0;
}