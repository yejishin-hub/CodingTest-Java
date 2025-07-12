class Solution {
    public int solution(String num_str) {
        int sum = 0;
        String[] arr = num_str.split("");
        for(String str : arr){
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}