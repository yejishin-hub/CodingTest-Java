class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int flag = 1;
        int val = 0;
        int idx1 = 0;
        int idx2 = 0;
        while(val <= n * n) {
            val++;
            answer[idx1][idx2] = val;
            if(val == n * n) {break;}
            if(flag == 1) {
                if(answer[idx1][idx2+1] == 0){
                    idx2++;
                    if(idx2 + 1 == n){
                        flag = 2;
                    }
                } else {
                    val--;
                    flag = 2;
                }
            } else if(flag == 2){
                if(answer[idx1+1][idx2] == 0){
                    idx1++;
                    if(idx1 + 1 == n){
                        flag = 3;
                    }
                } else {
                    val--;
                    flag = 3;
                }
            } else if(flag == 3){
                if(answer[idx1][idx2-1] == 0){
                    idx2--;
                    if(idx2 == 0){
                        flag = 4;
                    }
                } else {
                    val--;
                    flag = 4;
                }
            } else if(flag == 4){
                if(answer[idx1-1][idx2] == 0){
                    idx1--;
                    if(idx1 == 0){
                        flag = 1;
                    }
                } else {
                    val--;
                    flag = 1;
                }
            }
        }
        return answer;
    }
}