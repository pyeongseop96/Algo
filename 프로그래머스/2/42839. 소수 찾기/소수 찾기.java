import java.util.*;

class Solution {

    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited);

        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }

    void dfs(String numbers, String cur, boolean[] visited) {
        if (!cur.equals("")) {
            set.add(Integer.parseInt(cur));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) continue;

            visited[i] = true;
            dfs(numbers, cur + numbers.charAt(i), visited);
            visited[i] = false;
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}