class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int len = num_list.length;
        for(int i = 0; i < len / 2 ; i++) {
            int value = num_list[i];
            num_list[i] = num_list[len - (1 + i)];
            num_list[len - (1 + i)] = value;
        }
        answer = num_list;
        return answer;
    }
}