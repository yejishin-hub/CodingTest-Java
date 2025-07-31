import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numlist.length; i++){
            map.put(numlist[i], Math.abs(numlist[i] - n));
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        int value_num = -1;
        int key_num = -1;
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            if(value_num == entry.getValue() && key_num < entry.getKey()){
                answer[i-1] = entry.getKey();
                answer[i++] = key_num;
            } else {
                answer[i++] = entry.getKey();
            }
            value_num = entry.getValue();
            key_num = entry.getKey();
        }
        return answer;
    }
}