import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> list1 = new ArrayList(Arrays.asList(s1));
        List<String> list2 = new ArrayList(Arrays.asList(s2));
        list1.addAll(list2);
        String[] dest = list1.toArray(new String[0]);
        List<String> list3 = new ArrayList<>();

        for (String i : dest) {
            if (!list3.contains(i)) {
                list3.add(i);
            }
        }
        return s1.length + s2.length - list3.size();
    }
}