import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] array = my_string.toLowerCase().split("");
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        answer = sb.toString();
        return answer;
    }
}