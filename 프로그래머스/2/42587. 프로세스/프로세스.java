class Solution {
    public int solution(int[] priorities, int location) {
        int cnt = 0;
        int mx = 9;
        int idx = 0;
        boolean[] isClear = new boolean[priorities.length];
        for(int i=0; i<isClear.length; i++){
            isClear[i] = false;
        }
        int[] arr = new int[10];
        for(int i : priorities){
            arr[i]++;
        }
        while(arr[mx]==0){
            mx--;
        }
        while(true){
            if(!isClear[idx] && priorities[idx] == mx){
                cnt++;
                arr[mx]--;
                isClear[idx] = true;
                if(idx == location){
                    return cnt;
                }
           while(arr[mx]==0){
            mx--;
        }
            }
            idx++;
            if(idx==priorities.length){
                idx = 0;
            }
        }
    }
}