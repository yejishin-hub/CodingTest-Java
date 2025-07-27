class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer++;
            if(!Integer.toString(answer).contains("3")
                && answer % 3 != 0) {
                n--;
            }
        }
        return answer;
    }
}