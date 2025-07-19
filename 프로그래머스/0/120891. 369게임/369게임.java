class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] str = Integer.toString(order).split("");
        for(int i = 0; i < str.length; i++){
            if("3".equals(str[i]) || "6".equals(str[i]) || "9".equals(str[i])) {
                answer++;
            }
        }
        return answer;
    }
}