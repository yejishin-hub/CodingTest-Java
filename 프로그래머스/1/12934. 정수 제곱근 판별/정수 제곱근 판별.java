class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if(Math.round(num) == num) {
            return (long)Math.pow((long)num + 1, 2);
        }
        return -1;
    }
}