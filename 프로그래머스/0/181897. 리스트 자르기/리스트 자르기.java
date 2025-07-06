import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < num_list.length; i++) {
            if(n == 1) {
                if(slicer[1] < i) break;
                list.add(num_list[i]);
            }else if(n == 2) {
                if(slicer[0] > i) continue;
                list.add(num_list[i]);
            }else if(n == 3) {
                if(slicer[0] > i) continue;
                else if(slicer[1] < i) break;
                list.add(num_list[i]);
            }else{
                if(slicer[0] > i) continue;
                else if(slicer[1] < i) break;
                list.add(num_list[i]);
                i += slicer[2]-1;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}