import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;
        for(int[] query : queries) {
            int[] copy_arr = Arrays.copyOfRange(arr, query[0], query[1]+1);
            Arrays.sort(copy_arr);
            int value = -1;
            for(int i = 0; i < copy_arr.length; i++) {
                if(copy_arr[i] > query[2]) {
                    value = copy_arr[i];
                    break;
                }
            }
            answer[index++] = value;
        }
        return answer;
    }
}