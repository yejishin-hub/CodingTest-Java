class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int value = a;
        for(int i = 0; i < included.length; i++) {
            value = value + (i > 0 ? d : 0);
            answer = answer + (included[i] ? value : 0);
        }
        return answer;
    }
}