import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.length() - s.replace(s.charAt(i)+"","").length() == 1){
                list.add(s.charAt(i)+"");
            }
        }
        String[] arr = list.toArray(new String[list.size()]);
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}