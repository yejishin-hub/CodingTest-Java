class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        int len = numbers.length;
        if("right".equals(direction)){
            result[0] = numbers[len-1];
            for(int i = 1; i < numbers.length; i++){
                result[i] = numbers[i-1];
            }
        } else {
            result[len-1] = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                result[i-1] = numbers[i];
            }
        }
        return result;
    }
}