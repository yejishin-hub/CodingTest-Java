class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        if("+".equals(arr[1])){
            return a + b;
        }else if("-".equals(arr[1])){
            return a - b;
        }else{
            return a * b;
        }
    }
}