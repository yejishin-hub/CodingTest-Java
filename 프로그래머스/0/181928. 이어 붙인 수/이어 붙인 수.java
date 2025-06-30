class Solution {
    public int solution(int[] num_list) {
        int val1 = 0;
        int val2 = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
                val1 = Integer.parseInt(val1 + "" + num_list[i]);
            }else{
                val2 = Integer.parseInt(val2 + "" + num_list[i]);
            }
        }
        return val1 + val2;
    }
}