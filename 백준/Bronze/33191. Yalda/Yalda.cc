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
    int a,b,c,d; cin >> a >> b >> c >> d;
    if (a>=b) {
        cout << "Watermelon";
    }
    else if (a>=c) {
        cout << "Pomegranates";
    }
    else if (a>=d) {
        cout << "Nuts";
    }
    else {
        cout << "Nothing";
    }
}
