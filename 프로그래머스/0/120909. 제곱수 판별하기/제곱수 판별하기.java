class Solution {
    public int solution(int n) {
        // n = 144 ... => 12 * 12 = 144  제곱근 
        double s = Math.sqrt(n);
        int answer = s % 1 == 0.0 ? 1 : 2;
        return answer;
    }
}