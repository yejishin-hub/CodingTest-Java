import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i < j) {
                    int num = numbers[i] + numbers[j];
                    if(!list.contains(num)){
                        list.add(num);
                    }
                }
            }
        }
        int[] array = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(array);
        return array;
    }
}