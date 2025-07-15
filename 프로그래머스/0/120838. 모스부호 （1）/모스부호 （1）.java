class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            for(int i = 0; i < morse.length; i++){
                if(str.equals(morse[i])){
                    sb.append((char)(i+97));
                    break;
                }
            }
        }
        return sb.toString();
    }
}