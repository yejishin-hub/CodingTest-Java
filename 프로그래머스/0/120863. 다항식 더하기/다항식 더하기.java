class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ ");
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("x")){
                if("".equals(arr[i].replace("x",""))){
                    a += 1;
                }else{
                    a += Integer.parseInt(arr[i].replace("x",""));
                }
            }else{
               b += Integer.parseInt(arr[i]);
            }
        }
        answer = (a == 0 ? "" : a + "x") + (a != 0 && b != 0 ? " + " : "") + (b == 0 ? "" : + b);
        return a == 1 ? answer.replace("1x","x") : answer;
    }
}