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
   precision(5);
   int T = 0;
   while (true) {
      T++;
      int n; cin >> n;
      if (n==0)break;
      int m; cin >> m;
      cout << "User "<<T << endl;
      for (int i = 0; i < m; i++) {
         int o; cin >> o;
         cout << n*o*0.00001 << endl;
      }
   }
}
