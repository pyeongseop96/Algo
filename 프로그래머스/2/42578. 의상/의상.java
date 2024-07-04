import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] arr : clothes){
            map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
        }
        for(var val : map.values()){
            answer *= val+1;
        }
        return answer-1;
    }
}