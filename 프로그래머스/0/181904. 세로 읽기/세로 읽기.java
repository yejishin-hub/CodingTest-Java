class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = 0; i < my_string.length() / m; i++) {
            String[] arr = my_string.substring(i * m, (i+1) * m).split("");
            answer += arr[c-1];
        }
        return answer;
    }
}