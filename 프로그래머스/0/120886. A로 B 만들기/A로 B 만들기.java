class Solution {
    public int solution(String before, String after) {
        String[] arr = before.split("");
        for(int i = 0; i < arr.length; i++) {
            int findIndex = after.indexOf(arr[i]);
            if(findIndex == -1) {
                return 0;
            }else{
                after = after.substring(0, findIndex) + after.substring(findIndex + 1);
            }
        }
        return 1;
    }
}