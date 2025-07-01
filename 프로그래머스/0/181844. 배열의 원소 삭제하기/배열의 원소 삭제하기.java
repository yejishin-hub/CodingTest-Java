import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr)                     // -> IntStream
                                    .boxed()                        // -> Stream<Integer>
                                    .collect(Collectors.toList());  // -> List<Integer>
        for(int num : delete_list) {
            list.remove(Integer.valueOf(num));
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}