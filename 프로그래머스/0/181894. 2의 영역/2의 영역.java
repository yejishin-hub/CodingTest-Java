import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int fst_idx = 0;
        int last_idx = arr.length - 1;
        for(int i = fst_idx; i < arr.length; i++) {
            if(arr[i] == 2) {
                fst_idx = i;
                break;
            }
            if(i == arr.length-1) {
                return new int[]{-1};
            }
        }
        for(int i = last_idx; i >= 0; i--) {
            if(arr[i] == 2) {
                last_idx = i;
                break;
            }
        }
        answer = Arrays.copyOfRange(arr, fst_idx, last_idx+1);
        return answer;
    }
}