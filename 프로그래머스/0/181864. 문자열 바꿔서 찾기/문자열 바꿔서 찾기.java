class Solution {
    public int solution(String myString, String pat) {
        int answer = myString.replaceAll("A","X")
                            .replaceAll("B","A")
                            .replaceAll("X","B")
                            .contains(pat) ? 1 : 0;
        return answer;
    }
}