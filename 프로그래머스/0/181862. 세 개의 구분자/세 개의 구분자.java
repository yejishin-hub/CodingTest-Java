import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("b","a").replace("c","a");
        StringTokenizer st = new StringTokenizer(myStr, "a",false);
        List<String> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(!"".equals(str)){
                list.add(str);
            }
        }
        return list.size() == 0 ? new String[]{"EMPTY"} : list.toArray(new String[list.size()]);
    }
}