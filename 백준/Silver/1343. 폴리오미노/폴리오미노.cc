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

    cout << fixed << setprecision(15);

    string str; cin >> str;
    string ans;
    int cnt = 0;
    for (auto x : str) {
        if (x=='X') {
            cnt++;
        }
        else {

            if (cnt%2==1) {
                cout << -1;
                return 0;
            }

            for (int i=1; i<=cnt/4; i++) {
                ans += "AAAA";
            }
            if (cnt%4!=0 && cnt!=0) {
                ans += "BB";
            }
            ans += ".";
            cnt = 0;
        }
    }

    if (cnt%2==1) {
        cout << -1;
        return 0;
    }
    for (int i=1; i<=cnt/4; i++) {
        ans += "AAAA";
    }
    if (cnt%4!=0 && cnt!=0) {
        ans += "BB";
    }
    cout << ans;
    return 0;
}
