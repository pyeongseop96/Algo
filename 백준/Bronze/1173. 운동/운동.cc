#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int N, SM, BM, T, R; cin >> N >> SM >> BM >> T >> R;

    if (SM + T > BM) {
        cout << -1 << '\n';
        return 0;
    }

    int sum = 0;
    int cur = SM;
    int time = 0; 

    while (sum < N) {
        if (cur + T <= BM) {
            sum += 1;
            cur += T;
        } else {
            cur = max(SM, cur - R);
        }
        time++;
    }

    cout << time << '\n';
    return 0;
}
