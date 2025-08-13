import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            answer += Math.pow(10, i) * Integer.parseInt(arr[i]);
        }
        return answer;
    }
}