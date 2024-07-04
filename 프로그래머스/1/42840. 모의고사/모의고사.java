import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0,0};
        for(int i=0; i<answers.length; i++){
            if(arr1[i%5]==answers[i]){
                cnt[1]++;
            }
            if(arr2[i%8]==answers[i]){
                cnt[2]++;
            }
            if(arr3[i%10]==answers[i]){
                cnt[3]++;
            }
            
        }
        int max = Math.max(cnt[1],Math.max(cnt[2],cnt[3]));
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=3; i++){
            if(cnt[i]==max){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}