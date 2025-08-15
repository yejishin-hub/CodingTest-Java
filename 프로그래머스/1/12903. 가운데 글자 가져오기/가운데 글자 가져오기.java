class Solution {
    public String solution(String s) {
        int startIdx = s.length() % 2 == 0 ? s.length() / 2 - 1 : s.length() / 2;
        int endIdx = s.length() % 2 == 0 ? startIdx + 2 : startIdx + 1;
        return s.substring(startIdx, endIdx);
    }
}