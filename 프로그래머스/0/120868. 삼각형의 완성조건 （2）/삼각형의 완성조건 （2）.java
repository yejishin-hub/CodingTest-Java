class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int tmp = Math.max(sides[0], sides[1]) + 1;
        while(tmp < sides[0] + sides[1]){
            answer++;
            tmp++;
        }
        tmp = Math.max(sides[0],sides[1]);
        for(int i = 1; i <= tmp; i++){
            if(tmp < Math.min(sides[0],sides[1]) + i){
                answer++;
            }
        }
        return answer;
    }
}