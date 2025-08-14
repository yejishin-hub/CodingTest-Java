class Solution {
    public int solution(int num) {
        int cnt = 0;
        long lnum = (long)num;
        while(lnum != 1) {
            if(cnt > 500) {return -1;}
            cnt++;
            if(lnum % 2 == 0) {
                lnum = lnum / 2;
            } else {
                lnum = lnum * 3 + 1;
            }
        }
        return cnt;
    }
}