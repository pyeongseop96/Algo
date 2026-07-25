import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int a = 1;
        int b = 1;
        for(int[] size : sizes ){
            int big = Math.max(size[0], size[1]);
            int small = Math.min(size[0], size[1]);
            a = Math.max(a, big);
            b = Math.max(b, small);
        }
        int answer = a*b;
        return answer;
    }
}