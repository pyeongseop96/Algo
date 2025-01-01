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

    int T;
    cin>>T;
    int ans = 0;
    while(T!=0) {
        ans += T%2;
        T /= 2;
    }
    cout<<ans;


    return 0;
}