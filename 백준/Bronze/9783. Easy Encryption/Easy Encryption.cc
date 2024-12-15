#include <bits/stdc++.h>
using namespace std;

int main(void) {

    ios::sync_with_stdio(false);
    cin.tie(0);

    string s; getline(cin, s);
    for (char c : s) {
        int num = -1;
        if (c >= 'a' && c <= 'z') {

            num = c - 'a' + 1;
        }
        else if (c >= 'A' && c <= 'Z') {
            num = c - 'A' + 27;
        }
        else if (c >= '0' && c <= '9') {
            cout << '#' << c;
        }
        else {
            cout << c;
        }

        if (num >= 0) {
            if (num < 10) {
                cout << '0' << num;
            }
            else {
                cout << num;
            }
        }
    }


    return 0;
}