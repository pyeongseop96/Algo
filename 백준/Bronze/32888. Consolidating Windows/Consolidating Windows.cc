#include <bits/stdc++.h>
using namespace std;

using ll = long long;

#define precision(x) cout<<fixed;cout.precision(x);
#define all(a) begin(a), end(a)

/* 보석함
 * cout << (s.find("fgg") == string::npos) << endl;
 * ceil, round, floor
 * multiset<string> ss;
    cout << *s.rbegin() << endl;
 */

int main(void) {

    ios::sync_with_stdio(false);
    cin.tie(0);

    precision(10);

    ll a,b; cin>>a>>b;
    ll c = (a*a) + (b*b);
    cout << sqrt(c) << endl;




    return 0;
}