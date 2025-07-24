import java.util.StringTokenizer;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 자연수만 찾아서 더하기
        // 문자열에서 영문자만 replace => ex) *
        // *가 연속될 경우 치환
        my_string = my_string.replaceAll("[a-zA-Z]","*");
        StringTokenizer st = new StringTokenizer(my_string, "*");
        while(st.hasMoreTokens()){
		    String str = st.nextToken();
            if("".equals(str)){
                continue;
            }else{
                answer += Integer.parseInt(str);
            }
	    }
        return answer;
    }
}