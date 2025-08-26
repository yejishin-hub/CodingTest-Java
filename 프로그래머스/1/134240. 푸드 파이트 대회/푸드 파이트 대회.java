class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 0; i < food.length; i++) {
            int cnt = food[i] / 2;
            answer += (i+"").repeat(cnt);
        }
        answer += "0";
        for(int i = 0; i < food.length; i++) {
            int cnt = food[food.length-1-i] / 2;
            answer += ((food.length-i-1)+"").repeat(cnt);
        }
        return answer;
    }
}