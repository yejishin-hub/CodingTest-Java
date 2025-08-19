class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(i == s.indexOf(s.substring(i,i+1))) {
                answer[i] = -1;
            }else{
                String tmpStr = s.substring(0, i);
                answer[i] = i - tmpStr.lastIndexOf(s.substring(i,i+1));
            }
        }
        return answer;
    }
}