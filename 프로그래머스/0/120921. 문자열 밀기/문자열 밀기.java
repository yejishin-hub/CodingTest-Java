class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String tmpA = A;
        String[] arrA = A.split("");
        if(A.equals(B)) {
            return answer;
        }
        for(int i = 0; i < arrA.length; i++) {
            tmpA = arrA[arrA.length-1-i] + tmpA.substring(0,arrA.length-1);
            answer++;
            if(tmpA.equals(B)) {
                return answer;
            }
        }
        return -1;
    }
}