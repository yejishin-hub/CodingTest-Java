class Solution {
    public int solution(int M, int N) {
        return Math.min(getCnt(M,N),getCnt(N,M));
    }
    
    public int getCnt(int num1, int num2) {
        int cnt = 0;
        if(num1 >= 2) {
            cnt += num1 - 1;
        }
        if(num2 >= 2) {
            cnt += (num2 - 1) * num1;
        }
        return cnt;
    }
}