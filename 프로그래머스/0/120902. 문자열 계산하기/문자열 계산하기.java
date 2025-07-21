class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        String tmp = "+";
        for(int i = 0; i < arr.length; i++){
            if("+".equals(arr[i]) || "-".equals(arr[i])){
                tmp = arr[i];
            }else{
                if("+".equals(tmp)){
                    answer += Integer.parseInt(arr[i]);
                }else{
                    answer -= Integer.parseInt(arr[i]);
                }
            }
        }
        return answer;
    }
}