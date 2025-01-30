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

int sum(int a, int c, int r,int g,int b) {
   return a*((r*r)+(g*g)+(b*b))+c*min(min(r,g),b);
}

int main() {
   int T = 0; cin >> T;
   for (int i = 0; i < T; i++) {
      int a,c,r,g,b; cin >> a >> c >> r >> g >> b;
      vector<int> v(3);
      v[0] = sum(a,c,r+1,g,b);
      v[1] = sum(a,c,r,g+1,b);
      v[2] = sum(a,c,r,g,b+1);
      //cout << v[0] << ' ' << v[1] << ' ' << v[2] << endl;
      if (v[0] >= v[1] && v[0] >= v[2]) {
         cout << "RED" << endl;
      }
      else if (v[1] >= v[2] && v[1] >= v[0]) {
         cout << "GREEN" << endl;
      }
      else {
         cout << "BLUE" << endl;
      }
   }

}
