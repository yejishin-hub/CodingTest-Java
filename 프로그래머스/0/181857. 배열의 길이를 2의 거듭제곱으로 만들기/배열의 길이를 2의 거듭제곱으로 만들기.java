class Solution {
    public int[] solution(int[] arr) {
        int num = 0;
        int calc = 1;
        while(calc < arr.length) { 
            num++;
            calc = (int) Math.pow(2,num);
        }
        int[] answer = new int[calc];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}