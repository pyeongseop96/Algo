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

    cout << fixed << setprecision(15);

    vector<int> v = {31,28,31,30,31,30,31,31,30,31,30,31};
    vector<int> v2 = {31,29,31,30,31,30,31,31,30,31,30,31};

    map<string, int>m;
    m.insert(pair<string, int>("January", 1));
    m.insert(pair<string, int>("February", 2));
    m.insert(pair<string, int>("March", 3));
    m.insert(pair<string, int>("April", 4));
    m.insert(pair<string, int>("May", 5));
    m.insert(pair<string, int>("June", 6));
    m.insert(pair<string, int>("July", 7));
    m.insert(pair<string, int>("August", 8));
    m.insert(pair<string, int>("September", 9));
    m.insert(pair<string, int>("October", 10));
    m.insert(pair<string, int>("November", 11));
    m.insert(pair<string, int>("December", 12));
    string s; cin >> s;
    int sum = 0;
    int all = 0;
    int n = m[s];
    string s2; cin >> s2;
    int n2 = (s2[0]-'0')*10 + (s2[1]-'0');
    int year; cin >> year;
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        for (int i=0; i<n-1; i++) {
            sum += v2[i];
        }
        all = 366;
    }
    else {
        for (int i=0; i<n-1; i++) {
            sum += v[i];
        }
        all = 365;
    }
    sum += n2 - 1;
    string s3; cin >> s3;
    int n3 = (s3[0]-'0')*10 + (s3[1]-'0');
    int n4 = (s3[3]-'0')*10 + (s3[4]-'0');
    sum *= 24*60;
    all *= 24*60;
    sum += n3*60 + n4;
    cout << ((double)sum)*100 / all;
}
