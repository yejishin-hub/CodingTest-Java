class Solution {
    public int solution(String s) {
        if("+".equals(s.substring(0,1))) {
            return Integer.parseInt(s.substring(1,s.length()));
        }
        return Integer.parseInt(s);
    }
}