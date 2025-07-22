class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            String[] arr = (array[i] + "").split("");
            for(int j = 0; j < arr.length; j++){
                if("7".equals(arr[j])){
                    answer++;
                }
            }
        }
        return answer;
    }
}