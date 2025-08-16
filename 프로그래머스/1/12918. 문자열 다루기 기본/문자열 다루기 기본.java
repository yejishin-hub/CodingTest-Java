class Solution {
    public boolean solution(String s) {
        try{
            long num = Long.parseLong(s);
        }catch(NumberFormatException e){
            return false;
        }
        return s.length() == 4 || s.length() == 6 ? true : false;
    }
}