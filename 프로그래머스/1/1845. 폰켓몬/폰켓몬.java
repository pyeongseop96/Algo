import java.util.*;
class Solution {
    public int solution(int[] nums) {
        boolean[] arr = new boolean[200001];
        int cnt = 0;
        for(int i : nums){
            if(!arr[i]){
                cnt++;
                arr[i] = true;
            }
        }
        return Math.min(nums.length/2, cnt);
    }
}