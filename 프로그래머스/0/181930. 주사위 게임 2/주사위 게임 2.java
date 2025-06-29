class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int sum2 = sum * (a * a + b * b + c * c);
        int sum3 = sum2 * (a * a * a + b * b * b + c * c * c);
        if(a == b && b == c && c == a) {
            answer = sum3;
        } else if(a != b && b != c && c != a) {
            answer = sum;
        } else {
            answer = sum2;
        }
        return answer;
    }
}