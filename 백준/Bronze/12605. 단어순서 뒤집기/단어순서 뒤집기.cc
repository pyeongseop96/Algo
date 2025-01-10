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
    int n;
    cin >> n;

    for (int i = 1; i <= n; ++i) {
        string line;
        cin >> ws;
        getline(cin, line);

        vector<string> words;
        string word = "";

        for (char ch : line) {
            if (ch == ' ') {
                if (!word.empty()) {
                    words.push_back(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.empty()) {
            words.push_back(word);
        }

        // 단어 순서 뒤집기
        reverse(all(words));

        cout << "Case #" << i << ": ";
        for (size_t j = 0; j < words.size(); ++j) {
            if (j > 0) cout << " ";
            cout << words[j];
        }
        cout << endl;
    }

    return 0;
}
