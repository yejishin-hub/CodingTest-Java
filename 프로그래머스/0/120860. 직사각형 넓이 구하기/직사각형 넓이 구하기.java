class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < 4; i++) {
            if(dots[0][0] == dots[i][0]) {
                x = Math.abs(dots[i][1] - dots[0][1]);
            }else if(dots[0][1] == dots[i][1]){
                y = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        return x * y;
    }
}