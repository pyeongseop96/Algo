import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        for(int i=0; i<progresses.length; i++){
            int cur = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i]>0){
                cur++;
            }
            arr[i] = cur;
        }
        int idx = 0;
        int day = arr[0];
        List<Integer> ansList = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            if(arr[i]>day){
                ansList.add(i - idx);
                idx = i;
                day = arr[i];
            }
        }
        ansList.add(arr.length - idx);
        int[] answer = new int[ansList.size()];
        for(int i = 0; i<ansList.size(); i++){
            answer[i] = ansList.get(i);
        }
        return answer;
    }
}