class Solution {
    public boolean solution(int x) {
        int tmp = x;
        int sum = 0;
        for(int i = 0; i < String.valueOf(x).length(); i++) {
            sum += tmp % 10;
            tmp /= 10;
        }
        return x % sum == 0;
    }
}