class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for(int i = 0; i < num_list.length; i+=n){
            for(int j = 0; j < n; j++){
                answer[i/n][j] = num_list[i+j];//0%n
            }
        }
        return answer;
    }
}