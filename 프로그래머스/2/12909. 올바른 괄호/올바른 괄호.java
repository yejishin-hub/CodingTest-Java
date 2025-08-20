class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for (char e : s.toCharArray()){
            if(e == '(') {
                count++;
            }else {
                count--;
            }
            if (count < 0){
                answer = false;
                break;
            }
        }
        return count != 0 ? false : answer;
    }
}