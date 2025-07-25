import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String spellStr = "";
        for(String str : spell){
            spellStr += str;
        }
        
        // 모두 사용했는지 아닌지 ㅋ 
        for(String d : dic){
            String[] arr = d.split("");
            Arrays.sort(arr);
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
            
            String str = "";
            Iterator<String> it = list.iterator();
            
            while(it.hasNext()){
                str += it.next();
            }
            
            if(str.equals(spellStr)){
                return 1;
            }
            
        }
        return answer;
    }
}