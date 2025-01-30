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
      cout << "Case #" << i << ": ";
      int a,b,c; cin >> a >> b >> c;
      int sum = 0;
      for (int j=0; j<a; j++) {
         for (int k=0; k<b; k++) {
            for (int l=0; l<c; l++) {
               if ((j&k)==l) sum++;
            }
         }
      }
      cout << sum << endl;
   }

}
