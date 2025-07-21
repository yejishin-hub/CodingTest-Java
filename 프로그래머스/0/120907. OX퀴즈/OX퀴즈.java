class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int left = 0;
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);
            if("+".equals(arr[1])){
                left = x + y;
            }else{
                left = x - y;
            }
            
            if(left == Integer.parseInt(arr[4])){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}