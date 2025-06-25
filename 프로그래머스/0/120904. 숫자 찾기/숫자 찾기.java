class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] array = Integer.toString(num).split("");
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(Integer.toString(k))) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}