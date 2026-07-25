import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.add((long)i);
        }
        while(answer <= scoville.length - 2 && pq.peek() < K){
            answer++;
            Long l1 = pq.poll();
            Long l2 = pq.poll();
            Long cur = l1 + (l2 * 2);
            pq.add(cur);
        }
        Long l = pq.poll();
        if(l < K){
            return -1;
        }
        return answer;
    }
}