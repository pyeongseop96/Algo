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

    int a,b,c; cin >> a >> b >> c;
    int year = 0;
    while (true) {
        if (year%15==a-1 && year%28==b-1 && year%19==c-1) {
            cout << year+1 << endl;
            break;
        }
        year++;
    }

}
