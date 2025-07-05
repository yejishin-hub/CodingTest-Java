import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        Arrays.sort(indices);
        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for(int indice : indices) {
                if(indice == i){
                    flag = true;
                    break;
                }
            }
            if(!flag) {answer += arr[i];}
        }
        return answer;
    }
}