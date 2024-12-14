#include <bits/stdc++.h>
using namespace std;

int main(void) {

    ios::sync_with_stdio(false);
    cin.tie(0);

    vector<vector<int>> v(4, vector<int>(4, 0));
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> v[i][j];
        }
    }
    bool flag = true;
    int check = v[0][0] + v[0][1] + v[0][2] + v[0][3];
    for (int i = 0; i < 4; i++) {
        int sum = 0;
        for (int j = 0; j < 4; j++) {
            sum += v[i][j];
        }
        if (sum != check) {
            flag = false;
        }
    }
    for (int i = 0; i < 4; i++) {
        int sum = 0;
        for (int j = 0; j < 4; j++) {
            sum += v[j][i];
        }
        if (sum != check) {
            flag = false;
        }
    }

    if (flag) {
        cout << "magic" << endl;
    }
    else {
        cout << "not magic" << endl;
    }


    return 0;
}