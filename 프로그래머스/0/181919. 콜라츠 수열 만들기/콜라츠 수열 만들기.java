import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while(true) {
            list.add(n);
            if(n == 1) {break;}
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}