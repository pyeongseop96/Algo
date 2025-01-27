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
 */

int main() {
    string str; cin >> str;
    int l=0;
    int o=0;
    int v=0;
    int e=0;
    for (auto x : str) {
        if (x=='L') {
            l++;
        }
        else if (x=='O') {
            o++;
        }
        else if (x=='V') {
            v++;
        }
        else if (x=='E') {
            e++;
        }
    }
    int N; cin >> N;
    vector<string> a(N);
    for (int i = 0; i < N; i++) {
        cin >> a[i];
    }
    sort(all(a));
    int max = -1;
    string ans = "Aa";
    for (int i = 0; i < N; i++) {
        string cur = a[i];
        int l2 = l;
        int o2 = o;
        int v2 = v;
        int e2 = e;
        for (auto x : cur) {
            if (x=='L') {
                l2++;
            }
            else if (x=='O') {
                o2++;
            }
            else if (x=='V') {
                v2++;
            }
            else if (x=='E') {
                e2++;
            }
        }
        int score = ((l2+o2)*(l2+v2)*(e2+l2)*(o2+v2)*(o2+e2)*(v2+e2))%100;
        if (score>max) {
            max = score;
            ans = a[i];
        }
    }
    cout << ans;
}
