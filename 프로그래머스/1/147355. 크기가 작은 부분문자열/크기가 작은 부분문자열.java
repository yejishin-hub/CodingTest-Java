class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        int pLen = p.length();
        long pNum = Long.parseLong(p);
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            String str = t.substring(i,i+pLen);
            long num = Long.parseLong(str);
            if(num <= pNum) {
                cnt++;
            }
        }
        return cnt;
    }
}