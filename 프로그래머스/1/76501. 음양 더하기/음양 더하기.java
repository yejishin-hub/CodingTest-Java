class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i = 0; i < signs.length; i++) {
            sum += absolutes[i] * (signs[i] ? 1 : -1); 
        }
        return sum;
    }
}