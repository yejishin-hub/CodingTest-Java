class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            int score1 = score[i][0] + score[i][1];
            answer[i] = 1;
            for(int j = 0; j < score.length; j++) {
                int score2 = score[j][0] + score[j][1];
                if(i != j && score1 < score2) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}