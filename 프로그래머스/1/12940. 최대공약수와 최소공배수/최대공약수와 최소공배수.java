class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m, answer[0]);
        return answer;
    }
    
    //최대공약수
    public int gcd(int n, int m) {
        int div = Math.min(n, m);
        while(true){
            if(n % div == 0 && m % div == 0) {
                return div;
            }
            div--;
        }
    }
    
    //최소공배수
    public int lcm(int n, int m, int gcd) {
        return n * m / gcd;
    }
}