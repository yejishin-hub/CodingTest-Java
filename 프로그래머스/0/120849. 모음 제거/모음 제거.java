class Solution {
    public String solution(String my_string) {
        String answer = my_string.replace("a","")
                                .replace("e","")
                                .replace("i","")
                                .replace("o","")
                                .replace("u","");
        return answer;
    }
}