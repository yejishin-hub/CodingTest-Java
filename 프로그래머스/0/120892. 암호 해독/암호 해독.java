class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int repeat = cipher.length() / code;
        String[] array = cipher.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeat; i++) {
            sb.append(array[(i + 1) * code - 1]);
        }
        answer = sb.toString();
        return answer;
    }
}