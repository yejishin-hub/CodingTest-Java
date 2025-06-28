class Solution {
    public int solution(String number) {
        String[] array = number.split("");
        int sum = 0;
        for(String num : array) {
            sum += Integer.parseInt(num);
        }
        return sum % 9;
    }
}