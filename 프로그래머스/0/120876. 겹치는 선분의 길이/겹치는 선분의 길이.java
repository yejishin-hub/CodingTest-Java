import java.util.Arrays;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] dots = {lines[0][0],lines[0][1],lines[1][0]
                      ,lines[1][1],lines[2][0],lines[2][1]};
        Arrays.sort(dots);
        for(int i = 0; i < dots.length - 1; i++){
            int cnt = 0;
            for(int j = 0; j < 3; j++){
                if(lines[j][0] <= dots[i] && dots[i+1] <= lines[j][1]){
                    cnt++;
                }
                if(cnt >= 2) {
                    answer += Math.abs(dots[i+1] - dots[i]);
                    break;
                }
            }
        }
        return answer;
    }
}