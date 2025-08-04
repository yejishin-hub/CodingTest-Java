class Solution {
    public int solution(int n) {
        int sum = 0;
        int num = 1;
        while(num <= n) {
            if(n % num == 0) {
                sum += num;
            }
            num++;
        }
        return sum;
    }
}