import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr) {
            int cnt = num;
            while(cnt > 0){
                list.add(num);
                cnt--;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}