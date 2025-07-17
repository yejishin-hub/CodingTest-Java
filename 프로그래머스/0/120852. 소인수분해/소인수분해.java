import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 2;
        while(n != 1){
            if(n % num == 0) {
                n = n / num;
                list.add(num);
                while(true){
                    if(n % num == 0) {
                        n = n / num;
                    }else{
                        break;
                    }
                }
            }else{
                num++;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}