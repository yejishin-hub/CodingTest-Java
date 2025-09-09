import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(list.contains(words[i])) {
                answer[0] = i % n + 1; // 번호
                answer[1] = i / n + 1; // 차례
                break;
            } else if(i != 0 && !(words[i].substring(0,1))
                                    .equals(words[i-1].substring(words[i-1].length()-1,words[i-1].length()))) {
                answer[0] = i % n + 1; // 번호
                answer[1] = i / n + 1; // 차례
                break;
            }
            list.add(words[i]);
        }
        return answer;
    }
}