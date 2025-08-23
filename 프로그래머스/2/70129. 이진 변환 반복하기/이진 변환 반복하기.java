class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!"1".equals(s)){
            int zero_cnt = s.length() - s.replaceAll("0","").length();
            int num = s.length() - s.replaceAll("1","").length();
            s = Integer.toBinaryString(num);
            answer[0]++;
            answer[1] += zero_cnt;
        }
        return answer;
    }
}