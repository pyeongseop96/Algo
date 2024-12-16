#include <bits/stdc++.h>
using namespace std;

int main(void) {

    ios::sync_with_stdio(false);
    cin.tie(0);
    string ans = "hello";
    string s;
    getline(cin, s);
    int idx = 0;
    while (true) {
        if (s[idx]=='s'&&s[idx+1]=='o'&&s[idx+2]=='c'&&s[idx+3]=='i'&&s[idx+4]=='a'&&s[idx+5]=='l') {
            ans = "digital humanities";
            break;
        }

        if (s[idx]=='h'&&s[idx+1]=='i'&&s[idx+2]=='s'&&s[idx+3]=='t'&&s[idx+4]=='o'&&s[idx+5]=='r'&&s[idx+6]=='y') {
            ans = "digital humanities";
            break;
        }

        if (s[idx]=='l'&&s[idx+1]=='a'&&s[idx+2]=='n'&&s[idx+3]=='g'&&s[idx+4]=='u'&&s[idx+5]=='a'&&s[idx+6]=='g'&&s[idx+7]=='e') {
            ans = "digital humanities";
            break;
        }

        if (s[idx]=='l'&&s[idx+1]=='i'&&s[idx+2]=='t'&&s[idx+3]=='e'&&s[idx+4]=='r'&&s[idx+5]=='a'&&s[idx+6]=='c'&&s[idx+7]=='y') {
            ans = "digital humanities";
            break;
        }

        if (s[idx]=='b'&&s[idx+1]=='i'&&s[idx+2]=='g'&&s[idx+3]=='d'&&s[idx+4]=='a'&&s[idx+5]=='t'&&s[idx+6]=='a') {
            ans = "public bigdata";
            break;
        }

        if (s[idx]=='p'&&s[idx+1]=='u'&&s[idx+2]=='b'&&s[idx+3]=='l'&&s[idx+4]=='i'&&s[idx+5]=='c') {
            ans = "public bigdata";
            break;
        }

        if (s[idx]=='s'&&s[idx+1]=='o'&&s[idx+2]=='c'&&s[idx+3]=='i'&&s[idx+4]=='e'&&s[idx+5]=='t'&&s[idx+6]=='y') {
            ans = "public bigdata";
            break;
        }
        idx++;
    }
    cout << ans << endl;



    return 0;
}