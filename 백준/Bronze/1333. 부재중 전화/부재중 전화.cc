#include <bits/stdc++.h>
using namespace std;

using ll = long long;

#define precision(x) cout << fixed; cout.precision(x);
#define all(a) begin(a), end(a)

/* 보석함
 * cout << (s.find("fgg") == string::npos) << endl;
 * ceil, round, floor, sqrt
 * multiset<string> ss;
    cout << *s.rbegin() << endl;
 * vector<int> c(n);
    cout << max_element(c.begin(), c.end()) - c.begin()
 * bitset<1000> s;
 */

int main() {
    int a,b,c; cin >> a >>b>>c;
    int ans = c;
    while (true) {
        if (ans>(a*(b+5))-5 || ans % (b+5) >= b) {
            cout << ans << endl;
            break;
        }
        ans += c;
    }
}
