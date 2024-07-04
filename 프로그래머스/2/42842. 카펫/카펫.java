class Solution {
    public int[] solution(int brown, int yellow) {
        int a = ((brown - 4)/2)-1;
        int b = 1;
        while(a*b != yellow){
            a--;
            b++;
        }
        int[] answer = {a+2,b+2};
        return answer;
    }
}