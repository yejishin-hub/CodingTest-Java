class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        while(my_string.length() > 0){
            int cnt = my_string.length();
            String str = my_string.substring(0,1);
            my_string = my_string.replace(str,"");
            cnt = cnt - my_string.length();
            if(cnt != 0) {
                answer[alpha.indexOf(str)] = cnt;
            }
        }
        return answer;
    }
}