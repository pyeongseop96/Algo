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
    int T = 0;
    while (true) {
        T++;
        string s; int b; cin >> s >> b;
        if (s=="0") break;
        bool dead = false;
        int a = stoi(s);
        while (true) {
            string s2; int b2; cin >> s2 >> b2;
            if (s2=="E") {
                b -= b2;
            }
            else if (s2=="F"){
                b += b2;
            }
            else {
                break;
            }
            if (b <= 0) dead = true;

        }
        cout << T << " ";
        if (dead) {
             cout << "RIP" << endl;
        }
        else {
            if (b>a/2 && b<2*a) {
                cout << ":-)" << endl;
            }
            else {
                cout << ":-(" << endl;
            }
        }
    }
}
