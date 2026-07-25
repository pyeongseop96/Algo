import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer = dfs(0, 0, numbers, target);
        return answer;
    }
    int dfs(int idx, int sum, int[] numbers, int target){
        if(idx == numbers.length){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        return dfs(idx+1, sum+numbers[idx], numbers, target)
            + dfs(idx+1, sum-numbers[idx], numbers, target);
    }
}