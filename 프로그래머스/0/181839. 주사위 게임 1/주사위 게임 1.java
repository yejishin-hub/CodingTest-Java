class Solution {
    public int solution(int a, int b) {
        boolean a_flag = a % 2 == 1 ? true : false;
        boolean b_flag = b % 2 == 1 ? true : false;
        if(a_flag && b_flag){
            return (int)Math.pow(a,2) + (int)Math.pow(b,2);
        }else if(a_flag || b_flag){
            return 2 * (a + b);
        }else{
            return (int)Math.abs(a-b);
        }
    }
}