class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            if(str.length() > 0) {
                sb.append(str.substring(0,1).toUpperCase());
                if(str.length() > 1) {
                    sb.append(str.substring(1,str.length()).toLowerCase());
                }
                
            }
            if(i < arr.length - 1){
                sb.append(" ");
            } else {
                if(s.endsWith(" ")){
                   sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}