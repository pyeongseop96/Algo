#include <bits/stdc++.h>
using namespace std;

using ll = long long;

#define precision(x) cout<<fixed;cout.precision(x);
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

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int A,B,N; cin>>A>>B>>N;
    A %= B;
    int ans = 0;
    int cur = 1;
    while (cur <= N) {
        A *= 10;
        ans = A / B;
        A %= B;
        cur++;
    }
    cout<<ans<<"\n";
    return 0;
}