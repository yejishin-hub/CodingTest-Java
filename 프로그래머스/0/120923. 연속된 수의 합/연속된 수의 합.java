class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int add = 1;
        while(true){
            int sum = 0;
            for(int i = 0; i < num; i++) {
                answer[i] = i+add;
                sum += i+add;
            }
            if(sum == total) {
                break;
            }else if(sum < total) {
                add++;
            }else {
                add--;
            }
        }
        return answer;
    }
}