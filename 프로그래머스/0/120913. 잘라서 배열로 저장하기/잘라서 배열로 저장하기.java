class Solution {
    public String[] solution(String my_str, int n) {
        int size = (int)Math.ceil(my_str.length() / (double)n);
        String[] arr = new String[size];
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                arr[i] = my_str.substring(i * n, my_str.length());
                break;
            }
            arr[i] = my_str.substring(i * n, (i+1) * n);
        }
        return arr;
    }
}