class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if(num < min) {
                min = num;
            }else if(num > max) {
                max = num;
            }
        }
        return min + " " + max;
    }
}