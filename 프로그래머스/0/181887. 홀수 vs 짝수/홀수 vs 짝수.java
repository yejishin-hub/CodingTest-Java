class Solution {
    public int solution(int[] num_list) {
        int odd_sum = 0;
        int even_sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            if((i+1) % 2 == 1) {
                odd_sum += num_list[i];
            }else {
                even_sum += num_list[i];
            }
        }
        return odd_sum > even_sum ? odd_sum : even_sum;
    }
}