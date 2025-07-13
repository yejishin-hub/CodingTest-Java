class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0; i < picture.length; i++){
            String str = "";
            String[] arr = picture[i].split("");
            for(int j = 0; j < arr.length; j++){
                str += arr[j].repeat(k);
            }
            for(int j = i * k; j < (i * k) + k; j++){
                answer[j] = str;
            }
        }
        return answer;
    }
}