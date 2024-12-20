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

    int T;
    cin>>T;
    while(T--) {
        string n,m; cin>>n>>m;
        vector<int> v1(26);
        vector<int> v2(26);
        for (char c : n) {
            v1[c-'a']++;
        }
        for (char c : m) {
            v2[c-'a']++;
        }
        string ans = "YES";
        for (int i=0;i<26;i++) {
            if (v1[i]==0 && v2[i]!=0) {
                ans = "NO";
            }
        }
        cout<<ans<<"\n";
    }


    return 0;
}