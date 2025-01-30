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
   precision(6);
   int T = 0; cin >> T;
   for (int i = 1; i <= T; i++) {
      int n; cin >> n;
      vector<double> v(n);
      for (int j = 0; j < n; j++) {
         cin >> v[j];
      }
      for (int j = 1; j < n-1; j++) {
         v[j] = min((v[j-1]+v[j+1])/2,v[j]);
      }
      cout << "Case #" << i << ": " << v[n-2] << endl;
   }

}
