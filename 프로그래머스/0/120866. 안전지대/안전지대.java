class Solution {
    public int solution(int[][] board) {
        int size = board.length;
        int[][] tmp = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == 1){
                    tmp[i][j] = 1;
                    if(i-1 >= 0){
                        tmp[i-1][j] = 1; // 위
                        if(j-1 >= 0){
                            tmp[i-1][j-1] = 1; // 좌측상단 대각선
                        }
                        if(j+1 <= size-1){
                            tmp[i-1][j+1] = 1; // 우측상단 대각선
                        }
                    }
                    if(i+1 <= size-1){
                        tmp[i+1][j] = 1; // 아래
                        if(j+1 <= size-1){
                            tmp[i+1][j+1] = 1; // 우측하단 대각선
                        }
                        if(j-1 >= 0){
                            tmp[i+1][j-1] = 1; // 좌측하단 대각선
                        }
                    }
                    if(j-1 >= 0){
                        tmp[i][j-1] = 1; // 좌
                    }
                    if(j+1 <= size-1){
                        tmp[i][j+1] = 1; // 우
                    }
                }
            }
        }
        int sum = board.length * board.length;
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                sum -= tmp[i][j];
            }
        }
        return sum;
    }
}