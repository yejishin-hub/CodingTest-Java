class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.replaceAll("[^0-9]","").split("");
        for(String str : array) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}