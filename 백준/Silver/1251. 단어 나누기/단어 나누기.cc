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
 */

int main(void) {
    ios::sync_with_stdio(false);
    cin.tie(0);

    string str;
    cin>>str;
    string ans = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";

    for (int i = 0; i < str.size()-2; i++) {
        for (int j=i+1; j<str.size()-1; j++) {
            string cur = str;
            reverse(cur.begin(), cur.begin()+i+1);
            reverse(cur.begin()+i+1, cur.begin()+j+1);
            reverse(cur.begin()+j+1, cur.end());
            if (cur < ans) {
                ans = cur;
            }
        }
    }
    cout<<ans<<"\n";


    return 0;
}