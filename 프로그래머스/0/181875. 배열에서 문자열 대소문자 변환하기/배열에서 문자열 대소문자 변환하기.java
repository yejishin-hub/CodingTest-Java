class Solution {
    public String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 1) {
                strArr[i] = strArr[i].toUpperCase();
            }else if(i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        return strArr;
    }
}