import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer>map = new HashMap<>();
        for(String str : completion){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        String ans = "철수";
        for(String str : participant){
            int num = map.getOrDefault(str,0);
            if(num==0){
                ans = str;
                break;
            }
            map.put(str,num-1);
        }
        return ans;
    }
}