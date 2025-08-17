class Solution {
    public int solution(int n) {
        String num = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(num);
        String num2 = sb.reverse().toString();
        return Integer.parseInt(num2,3);
    }
}