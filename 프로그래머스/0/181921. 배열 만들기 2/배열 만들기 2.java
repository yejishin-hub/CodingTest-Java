import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        int[] arr = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            if(i % 5 != 0) {
                continue;
            }else if("".equals(Integer.toString(i).replaceAll("5","").replace("0",""))){
                list.add(i);
            }
        }
        arr = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return arr.length == 0 ? new int[]{-1} : arr;
    }
}