class Solution {
    public int solution(int n) {
        String str = Integer.toBinaryString(n);
        int one_cnt = str.length() - str.replace("1","").length();
        int answer = n + 1;
        while(true) {
            String rslt = Integer.toBinaryString(answer);
            int rslt_one_cnt = rslt.length() - rslt.replace("1","").length();
            if(one_cnt == rslt_one_cnt) {
                return answer;
            }
            answer++;
        }
    }
}