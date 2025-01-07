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

    vector<int> v1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    vector<int> v2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int y1,m1,d1,y2,m2,d2; cin>>y1>>m1>>d1>>y2>>m2>>d2;
    if(y1+1000<y2 || (y1+1000==y2 && m1<m2) || (y1+1000==y2 && m1==m2 && d1<=d2)){
    cout << "gg" << endl;}
    else {
        ll sum = 0;
        for (int i=y1; i<y2; i++) {
            if (i%400==0 || (i%4==0 && i%100!=0)) {
                sum += 366;
            }
            else {
                sum += 365;
            }
        }
        int tmp1 = 0; int tmp2 = 0;
        if (y1%400==0 || (y1%4==0 && y1%100!=0)) {
            for (int j=0; j<m1-1; j++) {
                tmp1 += v2[j];
            }
        }
        else {
            for (int j=0; j<m1-1; j++) {
                tmp1 += v1[j];
            }
        }
        if (y2%400==0 || (y2%4==0 && y2%100!=0)) {
            for (int j=0; j<m2-1; j++) {
                tmp2 += v2[j];
            }
        }
        else {
            for (int j=0; j<m2-1; j++) {
                tmp2 += v1[j];
            }
        }
        tmp1 += d1; tmp2 += d2;
        sum = sum - tmp1 + tmp2;


        cout << "D-" << sum << endl;
    }
    return 0;
}