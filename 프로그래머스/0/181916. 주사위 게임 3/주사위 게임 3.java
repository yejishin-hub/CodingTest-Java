import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = new int[]{a, b, c, d};
        Arrays.sort(arr);
        if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
            answer = 1111 * a;
        } else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[3]) {
            answer = arr[0];
        } else if(arr[0] == arr[1] && arr[2] == arr[3]) {
            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        } else if(arr[0] == arr[1] && arr[1] == arr[2]  && arr[2] != arr[3]){
            answer = (int) Math.pow(10 * arr[0] + arr[3], 2);
        } else if(arr[0] != arr[1] && arr[1] == arr[2]  && arr[2] == arr[3]){
            answer = (int) Math.pow(10 * arr[3] + arr[0], 2);
        }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) {
            if(arr[0] == arr[1]){
                return arr[2]*arr[3];
            }else if(arr[1] == arr[2]){
                return arr[0]*arr[3];
            }else{
                return arr[0]*arr[1];
            }
        }
        return answer;
    }
}