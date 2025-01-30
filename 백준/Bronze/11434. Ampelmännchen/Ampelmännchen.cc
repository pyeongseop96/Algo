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

 * stringstream ss(input);
 */

int main() {
   int T = 0; cin >> T;
   for (int i = 1; i <= T; i++) {
      cout << "Data Set " << i << ":" << endl;
      int sum = 0;
      int a,b,c; cin >> a >> b >> c;
      for (int j = 1; j <= a; j++) {
         int q,w,e,r; cin >> q >> w >> e >> r;
         sum += max(q*b+e*c, w*b+r*c);
      }
      cout << sum << endl << endl;
   }

}
