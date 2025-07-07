class Solution {
    public String[] solution(String[] str_list) {
        String flag = null;
        int len = 0;
        for(String str : str_list) {
            if("l".equals(str) || "r".equals(str)){
                flag = str;
                break;
            }
            len++;
        }
        String[] list = new String[len];
        int start = 0;
        if("r".equals(flag)) {
            list = new String[str_list.length-len-1];
            start = len + 1;
            len = str_list.length;
        }
        for(int i = start; i < len; i++) {
            list[i-start] = str_list[i];
        }
        return flag == null ? new String[]{} : list;
    }
}