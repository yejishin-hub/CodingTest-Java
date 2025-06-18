class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longSide = sides[0];
        int calc = sides[1] + sides[2];
        for(int i = 1; i < 3; i++) {
            if (longSide < sides[i]) {
                longSide = sides[i];
                calc = sides[0] + sides[1] + sides[2] - sides[i];
            }
        }
        answer = longSide < calc ? 1 : 2;
        return answer;
    }
}