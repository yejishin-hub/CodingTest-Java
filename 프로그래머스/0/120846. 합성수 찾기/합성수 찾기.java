class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i = 3; i <= n; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}