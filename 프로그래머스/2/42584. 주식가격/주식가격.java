import java.util.*;

class Pair {
    int idx;
    int val;
    public Pair(int idx, int val){
        this.idx = idx;
        this.val = val;
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Pair> d = new ArrayDeque<>();
        for(int i=0; i<prices.length; i++){
            while(!d.isEmpty() && d.peekFirst().val > prices[i]){
                Pair cur = d.pollFirst();
                answer[cur.idx] = i - cur.idx;
            }
            while(!d.isEmpty() && d.peekLast().val > prices[i]){
                Pair cur = d.pollLast();
                answer[cur.idx] = i - cur.idx;
            }
            d.offerLast(new Pair(i, prices[i]));
        }
        while(!d.isEmpty()){
            Pair cur = d.pollLast();
            answer[cur.idx] = prices.length-1 - cur.idx; 
        }
        return answer;
    }
}