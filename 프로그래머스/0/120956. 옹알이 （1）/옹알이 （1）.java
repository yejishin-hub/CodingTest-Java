class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya","ye","woo","ma"};
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < arr.length; j++){
                babbling[i] = babbling[i].replace(arr[j],"|");
            }
            if("".equals(babbling[i].replace("|",""))){
                answer++;
            }
        }
        return answer;
    }
}