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
    string str; cin >> str;
    int n = str.length();
    int joi = 0;
    int ioi = 0;
    for (int i=0; i<n-2; i++) {
        if (str[i]=='J' && str[i+1]=='O' && str[i+2]=='I') {
            joi++;
        }
        if (str[i]=='I' && str[i+1]=='O' && str[i+2]=='I') {
            ioi++;
        }
    }
    cout << joi << endl << ioi << endl;
}
