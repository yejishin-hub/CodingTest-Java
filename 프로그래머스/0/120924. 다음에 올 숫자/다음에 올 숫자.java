class Solution {
    public int solution(int[] common) {
        int add = common[1] - common[0];
        if(common[0] == 0) {
            return common[common.length - 1] + add;
        }
        int mul = common[1] / common[0];
        boolean flag = true; // true : 등차, false : 등비
        for(int i = 1; i < common.length - 1; i++) {
            if(common[i] != 0 && common[i+1] / common[i] != mul) {
                flag = true;
                break;
            }else if(common[i+1] - common[i] != add) {
                flag = false;
                break;
            }
        }
        return flag ? common[common.length - 1] + add
            : common[common.length - 1] * mul;
    }
}