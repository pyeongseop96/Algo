class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        answer = dfs(1,1000000000000000000L, n, times);
        return answer;
    }
    long dfs(long min, long max, int n, int[] times){
        if(min == max){
            return min;
        }
        long mid = (min + max) / 2;
        long sum = 0;
        for(int time : times){
            sum += mid / time;
        }
        if(sum >= n){
            max = mid;
        }
        else{
            min = mid + 1;
        }
        return dfs(min, max, n, times);
    }
}