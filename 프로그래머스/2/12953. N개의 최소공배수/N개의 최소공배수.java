class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1) return arr[0];        
        int num = this.lcm(arr[0], arr[1]); 
        for(int i = 2; i < arr.length; i++) {
            num = this.lcm(num, arr[i]);
        }
        return num;
    }
    
    public int lcm(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int idx = 2;
        while(true) {
            int num = min * idx++;
            if(num % max == 0) {
                return num;
            }
        }
    }
}