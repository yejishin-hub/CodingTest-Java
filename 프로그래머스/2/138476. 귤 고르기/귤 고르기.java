import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // 개수가 가장 많은 숫자를 먼저 남으면 되것네 ㅋ
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) {
            if(map.get(tangerine[i]) != null) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                map.put(tangerine[i], 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());

        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            return o2.getValue() - o1.getValue(); //내림 차순
            }
        });

        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            if(entry.getValue() >= k) {
                answer++;
                break;
            }else{
                sum += entry.getValue();
                answer++;
                if(sum >= k) {
                    break;
                }
            }
        }

        return answer;
    }
}