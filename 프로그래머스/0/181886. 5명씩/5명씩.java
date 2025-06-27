import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        List<String> group = new ArrayList<>();
        for(int i = 0; i < names.length; i+=5) {
            group.add(names[i]);
        }
        answer = group.toArray(new String[group.size()]);
        return answer;
    }
}