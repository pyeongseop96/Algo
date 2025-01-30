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
   int N; cin >> N;
   double gold = (1+sqrt(5.0)) / 2.0;
   for (int i = 1; i <= N; i++) {
      double a,b; cin >> a >> b;
      double c = a/b;
      if (c>=0.99*gold && c<=1.01*gold) {
         cout << "golden" << endl;
      }
      else {
         cout << "not" << endl;
      }
   }
}
