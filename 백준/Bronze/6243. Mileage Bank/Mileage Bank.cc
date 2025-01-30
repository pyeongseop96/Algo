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
    while (true) {
        string s; getline(cin, s);
        if (s=="#") break;
        int sum = 0;
        while (true) {
            if (s=="0") break;
            stringstream ss(s);
            string nnnn; ss >> nnnn;
            string nnn; ss >> nnn;
            string n; ss >> n;
            //cout << n << endl;
            int nn = stoi(n);
            //cout << nn << endl;
            string s3; ss >> s3;
            if (s3=="F") {
                sum += nn*2;
            }
            else if (s3=="B"){
                sum += nn;
                sum += (nn+1)/2;
            }
            else {
                sum += max(500,nn);
            }

            getline(cin, s);
        }
        cout << sum << endl;
    }
}
