class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i = 0; i < answer.length - 1; i++) {
            answer[i] = num_list[i];
        }
        int calc = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        answer[num_list.length] = calc > 0 ? calc : num_list[num_list.length - 1] * 2;
        return answer;
    }
}