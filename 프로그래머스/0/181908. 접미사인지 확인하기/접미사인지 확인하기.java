class Solution {
    public int solution(String my_string, String is_suffix) {
        int str_len = my_string.length();
        int suf_len = is_suffix.length();
        if(suf_len > str_len) {
            return 0;
        }
        return is_suffix.equals(my_string.substring(str_len-suf_len)) ? 1 : 0;
    }
}