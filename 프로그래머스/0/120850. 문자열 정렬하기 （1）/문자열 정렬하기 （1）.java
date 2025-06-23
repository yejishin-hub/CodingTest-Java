import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String[] array = my_string.replaceAll("[^0-9]","").split("");
        int[] answer = new int[array.length];
        int i = 0;
        for(String str : array){
            answer[i++] = Integer.parseInt(str);
        }
        Arrays.sort(answer);
        return answer;
    }
}