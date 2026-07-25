import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int[] parent = new int[n];
        for(int i=1; i<n; i++){
            parent[i] = i;
        }
        for(int i=0; i<n; i++){
            int[] computer = computers[i];
            for(int j=i+1; j<n; j++){
                if(computer[j] == 1){
                    union(i, j, parent);
                }
            }
        }
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<n; i++){
            s.add(find(i, parent));
        }
        int answer = s.size();
        return answer;
    }
    
    void union(int i, int j, int[] parent){
        parent[find(j, parent)] = find(i, parent);
    }
    
    int find(int i, int[] parent){
        if(parent[i] == i){
            return i;
        }
        return parent[i] = find(parent[i], parent);
    }
}