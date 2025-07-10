import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.trim().split(" ");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll(" ","");
            if(!"".equals(arr[i])){
                list.add(arr[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}