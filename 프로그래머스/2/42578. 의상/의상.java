import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> m = new HashMap<>();
        for(String[] sArr : clothes){
            m.put(sArr[1], m.getOrDefault(sArr[1], 0) + 1);
        }
        for(int i : m.values()){
            System.out.println(i);
            answer *= (i+1);
        }
        answer--;
        return answer;
    }
}