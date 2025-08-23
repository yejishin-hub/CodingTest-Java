class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) {
            answer++; // n 자신
            for(int i = 1; i < n / 2 + 1; i++) {
                if(this.getSum(i, n) == n){
                    answer++;
                }
            }
        } else {
            answer++; // n 자신
            for(int i = 1; i < n / 2 + 1; i++) {
                if(this.getSum(i, n) == n){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public int getSum(int num, int n) {
        int sum = 0;
        while(true){
            sum += num++;
            if(sum == n){
                break;
            }else if(sum > n) {
                break;
            }
        }
        return sum;
    }
}