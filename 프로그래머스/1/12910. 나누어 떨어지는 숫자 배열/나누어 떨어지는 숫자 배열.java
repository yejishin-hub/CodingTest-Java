import java.util.stream.IntStream;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        Arrays.sort(answer);
        return answer.length == 0 ? new int[] {-1}: answer;
    }
}