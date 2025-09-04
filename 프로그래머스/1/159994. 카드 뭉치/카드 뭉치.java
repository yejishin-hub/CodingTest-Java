import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> list2 = new ArrayList<>(Arrays.asList(cards2));
        for(int i = 0; i < goal.length; i++) {
            String str = goal[i];
            if(list1.size() != 0 && str.equals(list1.get(0))) {
                list1.remove(0);
            } else if(list2.size() != 0 && str.equals(list2.get(0))) {
                list2.remove(0);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}