class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("[x]");
        int[] answer = new int[myString.endsWith("x") ? arr.length + 1 : arr.length];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        if(myString.endsWith("x")){
            answer[arr.length] = 0;
        }
        return answer;
    }
}