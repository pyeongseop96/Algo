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
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int m; cin >> m;
    ll ans = 0;
    for (int i = 0; i < n; i++) {
        int cur = a[i];
        if (cur==0) {
            continue;
        }
        int x = cur / m;
        if (cur % m != 0) {
            x++;
        }
        ans += x*m;

    }
    cout << ans << endl;
    return 0;
}
