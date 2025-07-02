import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk_list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int size = stk_list.size();
            if(size == 0) {
                stk_list.add(arr[i]);
            }else if(size != 0 && stk_list.get(size - 1) < arr[i]) {
                stk_list.add(arr[i]);
            }else if(size != 0 && stk_list.get(size - 1) >= arr[i]) {
                stk_list.remove(size - 1);
                i--;
            }
        }
        return stk_list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}