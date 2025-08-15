class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if(arr.length - 1 == 0) {return new int[]{-1};}
        int min = arr[0];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        int tmpIdx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == idx) {
                continue;
            }
            answer[tmpIdx++] = arr[i];
        }
        return answer;
    }
}