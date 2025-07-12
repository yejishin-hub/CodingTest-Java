import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int choose = 0;
        int seq = 1;
        List<Integer> list = Arrays.stream(rank).boxed()
                            .collect(Collectors.toList());
        int[] arr = new int[3];
        while(choose < 3) {
            if(attendance[list.indexOf(seq)]){
                arr[choose] = list.indexOf(seq);
                choose++;
            }
            seq++;
        }
        return 10000 * arr[0] + 100 * arr[1] + arr[2];
    }
}