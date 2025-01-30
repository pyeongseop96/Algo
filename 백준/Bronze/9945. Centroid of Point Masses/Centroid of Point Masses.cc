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
   precision(2);
   int T = 0;
   while (true) {
      T++;
      int n; cin >> n;
      if (n<0) break;
      ll sum1 = 0, sum2 = 0, sum3 = 0;
      for (int i = 0; i < n; i++) {
         ll a,b,c; cin >> a >> b >> c;
         sum1 += a*c;
         sum2 += b*c;
         sum3 += c;
      }
      cout << "Case " << T << ": " << sum1*1.0/sum3 << " " << sum2*1.0/sum3 << endl;
   }
}
