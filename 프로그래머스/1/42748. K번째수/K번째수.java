import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] com : commands){
            int start = com[0]-1;
            int end = com[1]-1;
            List<Integer> curList = new ArrayList<>();
            for(int i=start; i<=end; i++){
                curList.add(array[i]);
            }
            Collections.sort(curList);
            list.add(curList.get(com[2]-1));
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}