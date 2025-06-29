class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        if(!my_string.contains(alp)) {
            return my_string;
        }
        for(char c : my_string.toCharArray()) {
            if((String.valueOf(c)).equals(alp)) {
                answer += alp.toUpperCase();
            } else {
                answer += c;
            }
        }
        return answer;
    }
}