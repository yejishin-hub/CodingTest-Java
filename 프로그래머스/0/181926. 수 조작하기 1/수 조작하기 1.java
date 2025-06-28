class Solution {
    public int solution(int n, String control) {
        int answer = n
            + (control.length() - control.replace("w","").length())
            - (control.length() - control.replace("s","").length())
            + 10 * (control.length() - control.replace("d","").length())
            - 10 * (control.length() - control.replace("a","").length());
        return answer;
    }
}