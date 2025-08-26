class Solution {
    public int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four"
                      , "five", "six", "seven", "eight", "nine"};
        int idx = 0;
        while(!s.matches("[0-9]+")){
            s = s.replaceAll(arr[idx],""+idx);
            idx++;
        }
        return Integer.parseInt(s);
    }
}