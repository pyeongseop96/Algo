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

    int mx = 0;
    int sum = 0;
    int N; cin>>N;
    for(int i = 1; i <= N; i++) {
        int a,b; cin>>a>>b;
        sum += b - a;
        if (sum > mx) {
            mx = sum;
        }
    }
    cout<<mx<<"\n";




    return 0;
}