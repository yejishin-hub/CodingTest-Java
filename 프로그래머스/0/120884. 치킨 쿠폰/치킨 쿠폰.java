class Solution {
    public int solution(int chicken) {
        int coupon = 0;
        int sum = 0;
        while(chicken / 10 > 0) {
            coupon += (chicken - chicken / 10 * 10);
            chicken /= 10;
            sum += chicken;
            if(chicken > 0 && chicken < 10) {
                coupon += chicken;
            }
        }
        int tmp = coupon / 10;
        while(coupon / 10 > 0) {
            sum += tmp;
            if(tmp > 0 && tmp < 10) {
                coupon += tmp;
            }
            coupon -= tmp * 10;
            tmp = coupon / 10;
        }
        return sum;
    }
}