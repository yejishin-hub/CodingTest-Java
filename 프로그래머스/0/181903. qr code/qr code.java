class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] array = code.split("");
        for(int i = r; i < code.length(); i+=q) {
            answer += array[i];
        }
        return answer;
    }
}