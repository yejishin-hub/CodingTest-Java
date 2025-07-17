class Solution {
    public int solution(String s) {
        int answer = 0;
        // Z 나오면 바로 전에 더했던 숫자 뺀다 .
        // 
        String[] arr = s.split(" ");
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            if("Z".equals(arr[i])){
                answer -= tmp;
            }else{
                answer += Integer.parseInt(arr[i]);
                tmp = Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}