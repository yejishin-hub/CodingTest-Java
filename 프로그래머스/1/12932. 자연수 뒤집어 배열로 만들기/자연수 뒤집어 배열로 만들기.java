class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(n+"").length()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt((n+"").substring(answer.length-1-i,answer.length-i));
        }
        return answer;
    }
}