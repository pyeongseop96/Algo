#include <bits/stdc++.h>
using namespace std;

int main(void) {

    ios::sync_with_stdio(false);
    cin.tie(0);

    string s1; cin >> s1;
    int i1; cin >> i1;
    string s2; cin >> s2;
    int i2; cin >> i2;
    string s3; cin >> s3;
    int i3; cin >> i3;
    string s4; cin >> s4;
    int i4; cin >> i4;
    string s5; cin >> s5;
    int i5; cin >> i5;
    string s6; cin >> s6;
    int i6; cin >> i6;
    while (true) {
        string tmp; cin >> tmp;
        if (tmp=="-1") {
            break;
        }
        int sum = 0;
        if (s1==tmp) {
            sum += i1;
        }
        if (s2[0] ==tmp[0] && s2[1] ==tmp[1] && s2[2] ==tmp[2]) {
            sum += i2;
        }
        if (s3[0] ==tmp[0] && s3[1] ==tmp[1] && s3[2] ==tmp[2]) {
            sum += i3;
        }
        if (s4[0] ==tmp[3] && s4[1] ==tmp[4] && s4[2] ==tmp[5]) {
            sum += i4;
        }
        if (s5[0] ==tmp[3] && s5[1] ==tmp[4] && s5[2] ==tmp[5]) {
            sum += i5;
        }
        if (s6[0] ==tmp[4] && s6[1] ==tmp[5]) {
            sum += i6;
        }

            cout << sum << endl;

    }


    return 0;
}