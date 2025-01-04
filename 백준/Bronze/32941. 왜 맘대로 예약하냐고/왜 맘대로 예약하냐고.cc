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

    int T,X; cin>>T>>X;
    int N; cin>>N;
    string S = "YES";
    for (int i=0;i<N;i++) {
        int M; cin>>M;
        bool flag = false;
        for (int j=0;j<M;j++) {
            int A; cin>>A;
            if (A==X) flag = true;
        }
        if (!flag) S = "NO";
    }
    cout<<S<<"\n";

    return 0;
}