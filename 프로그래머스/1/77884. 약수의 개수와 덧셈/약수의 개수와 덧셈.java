class Solution {
    public int solution(int left, int right) {
        int total = 0;
        for(int i = left; i <= right; i++) {
            int cnt = getDivisorCnt(i);
            if(cnt % 2 == 0) {
                total += i;
            }else{
                total -= i;
            }
        }
        return total;
    }
    
    public int getDivisorCnt(int num) {
        int cnt = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0) cnt++;
        }
        return cnt;
    }
}