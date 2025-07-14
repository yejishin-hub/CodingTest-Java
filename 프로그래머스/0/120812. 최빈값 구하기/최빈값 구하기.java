import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(int[] array) {
        int maxCount = 0;   // 최빈값
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();    // key: array 원소, value: 원소 개수
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            } else if(count == maxCount){ // 최빈값이 여러 개
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}