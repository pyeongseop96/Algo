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
    int T = 0;
    while (true) {
        T++;
        string N; getline(cin,N);
        if (N=="0") break;
        int N2 = stoi(N);
        vector<string> v(N2);
        for (int i = 0; i < N2; i++) {
            string str; getline(cin, str);
            v[i] = str;
        }
        int sum = (N2*N2) + N2;
        for (int i=1; i<2*N2; i++) {
            string str; getline(cin, str);
            stringstream ss(str);
            int m;
            ss >> m;
            sum -= m;
        }
        cout << T << " " << v[sum-1] << endl;
    }
}
