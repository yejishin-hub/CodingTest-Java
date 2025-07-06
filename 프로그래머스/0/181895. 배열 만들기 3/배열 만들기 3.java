import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] interval : intervals) {
            int[] tmpArr = Arrays.copyOfRange(arr,interval[0], interval[1]+1);
            for (int num : tmpArr) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}