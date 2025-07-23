class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        float xMax = (float)board[0] / 2;
        float yMax = (float)board[1] / 2;
        for(int i = 0; i < keyinput.length; i++){
            String key = keyinput[i];
            if("up".equals(key)){
                if(yMax < Math.abs(answer[1] + 1)){
                    continue;
                }
                answer[1]++;
            }else if("down".equals(key)){
                if(yMax < Math.abs(answer[1] - 1)){
                    continue;
                }
                answer[1]--;
            }else if("left".equals(key)){
                if(xMax < Math.abs(answer[0] - 1)){
                    continue;
                }
                answer[0]--;
            }else if("right".equals(key)){
                if(xMax < Math.abs(answer[0] + 1)){
                    continue;
                }
                answer[0]++;
            }
        }
        return answer;
    }
}