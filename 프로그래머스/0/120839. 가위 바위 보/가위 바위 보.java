class Solution {
    public String solution(String rsp) {
        String answer = rsp.replaceAll("2","a")
                    .replaceAll("0","b")
                    .replaceAll("5","c")
                    .replaceAll("a","0")
                    .replaceAll("b","5")
                    .replaceAll("c","2");
        return answer;
    }
}