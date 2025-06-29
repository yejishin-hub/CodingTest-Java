import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < num_list.length; i+=n) {
            list.add(num_list[i]);
            if(i + n > num_list.length - 1) {
                break;
            }
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}