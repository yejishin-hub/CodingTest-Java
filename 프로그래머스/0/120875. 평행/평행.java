class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        float xDiff1 = dots[0][0] - dots[1][0];
        float yDiff1 = dots[0][1] - dots[1][1];
        float xDiff2 = dots[2][0] - dots[3][0];
        float yDiff2 = dots[2][1] - dots[3][1];
        if(yDiff1 / xDiff1 == yDiff2 / xDiff2){
            return 1;
        }
        xDiff1 = dots[0][0] - dots[2][0];
        yDiff1 = dots[0][1] - dots[2][1];
        xDiff2 = dots[1][0] - dots[3][0];
        yDiff2 = dots[1][1] - dots[3][1];
        if(yDiff1 / xDiff1 == yDiff2 / xDiff2){
            return 1;
        }
        xDiff1 = dots[0][0] - dots[3][0];
        yDiff1 = dots[0][1] - dots[3][1];
        xDiff2 = dots[1][0] - dots[2][0];
        yDiff2 = dots[1][1] - dots[2][1];
        if(yDiff1 / xDiff1 == yDiff2 / xDiff2){
            return 1;
        }
        return answer;
    }
}