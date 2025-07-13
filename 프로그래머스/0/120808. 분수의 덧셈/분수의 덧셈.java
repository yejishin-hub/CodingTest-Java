class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        int gcdnum = gcd(denom1 * denom2, numer1 * denom2 + numer2 * denom1);
        answer [1] = (denom1 * denom2) / gcdnum;
        answer [0] = (numer1 * denom2 + numer2 * denom1) / gcdnum;
        return answer;
    }
    
    public int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}