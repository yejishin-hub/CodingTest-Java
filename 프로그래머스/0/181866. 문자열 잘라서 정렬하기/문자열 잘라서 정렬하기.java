import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!"".equals(arr[i])){
                list.add(arr[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}