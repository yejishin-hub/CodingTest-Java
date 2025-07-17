class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for(String str : arr){
		    if(!answer.contains(str)){            
                answer += str;
            }
	    }
        return answer;
    }
}