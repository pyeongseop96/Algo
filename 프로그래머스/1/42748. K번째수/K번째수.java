import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] command = commands[i];
            int[] arr = new int[command[1] - command[0] + 1];
            for(int j=0; j<arr.length; j++){
                arr[j] = array[j+command[0]-1];
            }
            Arrays.sort(arr);
            answer[i] = arr[command[2]-1];
        }
        return answer;
    }
}