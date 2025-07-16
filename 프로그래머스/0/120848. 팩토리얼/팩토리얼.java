class Solution {
    public int solution(int n) {
        int k = 1;
        double calc = n;
        while(calc >= 1){
            k++;
            calc = (double) calc / k;
        }
        return k-1;
    }
}