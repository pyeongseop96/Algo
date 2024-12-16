#include <bits/stdc++.h>
using namespace std;

int main(void) {

    ios::sync_with_stdio(false);
    cin.tie(0);
    string ans = "hello";
    while (!cin.eof()) {
        string s; cin >> s;
        if (s=="social" || s=="history" || s=="language" || s=="literacy") {
            ans = "digital humanities";
        }
        if (s=="bigdata" || s=="public" || s=="society") {
            ans = "public bigdata";
        }
    }
    cout << ans << endl;


    /*int T; cin >> T;
    while (T--) {

        int N,l1,r1,l2,r2; cin >> N >> l1 >> r1 >> l2 >> r2;
        long long ans = 0;
        long long M = 1;
        while (M<=1000000000) {
            double d1 = (double)l2 / (double)M;
            double d2 = (double)r2 / (double)M;
            int e1 = max(l1,(int)ceil(d1));
            int e2 = min(r1,(int)floor(d2));
            if (e1 <= e2) {
                ans += e2 - e1 + 1;
            }
            //ans += e2 - e1 + 1;
            M*=N;
        }
        cout << ans << endl;
    }*/


    return 0;
}