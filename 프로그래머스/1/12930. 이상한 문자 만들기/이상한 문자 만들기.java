class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            String[] word = arr[i].split("");
            for(int j = 0; j < word.length; j++){
                if(j % 2 == 0) {
                    word[j] = word[j].toUpperCase();
                } else {
                    word[j] = word[j].toLowerCase();
                }
                sb.append(word[j]);
            }
            if(i != arr.length - 1) {
                sb.append(" ");
            }else{
                sb.append(" ".repeat(s.length() - sb.toString().length()));
            }
        }
        System.out.println(s);
        System.out.println(sb.toString());
        return sb.toString();
    }
}