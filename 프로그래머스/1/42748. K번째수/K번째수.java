import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            int[] arr = commands[i];
            for(int j = arr[0] - 1; j <= arr[1] - 1; j++){
                list.add(array[j]);
            }
            int[] tmp = list.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(tmp);
            answer[i] = tmp[arr[2] - 1];
        }
        return answer;
    }
}