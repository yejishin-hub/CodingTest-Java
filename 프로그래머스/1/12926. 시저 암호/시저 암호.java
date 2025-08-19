class Solution {
    public String solution(String s, int n) {
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            int ascii = str[i].charAt(0);
            if(ascii == 32) {
                sb.append(" ");
            } else {
                int num = ascii + n;
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){
                    if(num > 90) {
                        num = num - 26;
                    }
                } else {
                    if (num > 122) {
                        num = num - 26;
                    }
                }
                sb.append((char)(num));
            }
        }
        return sb.toString();
    }
}