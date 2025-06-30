class Solution {
    public String solution(String code) {
        String answer = "";
        String[] array = code.split("");
        int mode = 0;
        for(int i = 0; i < array.length; i++) {
            if("1".equals(array[i])){
                mode = mode == 0 ? 1 : 0;
            } else {
                if(mode == 0 && i % 2 == 0) {
                    answer += array[i];
                } else if(mode == 1 && i % 2 == 1) {
                    answer += array[i];
                }
            }
        }
        return answer == "" ? "EMPTY" : answer;
    }
}