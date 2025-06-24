class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] array = my_string.split("");
        String tempStr = array[num1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                sb.append(array[num2]);
            } else if(i == num2) {
                sb.append(tempStr);
            } else {
                sb.append(array[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}