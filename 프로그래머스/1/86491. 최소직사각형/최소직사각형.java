import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int a = 1;
        int b = 1;
        for(int[] arr : sizes){
            a = Math.max(a,Math.max(arr[0],arr[1]));
            b = Math.max(b,Math.min(arr[0],arr[1]));
        }
        int answer = a*b;
        return answer;
    }
}