class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for(int num = i; num <= j; num++) {
            String str = Integer.toString(num);
            if(str.contains(k + "")) {
                String[] arr = str.split("");
                for(int l = 0; l < arr.length; l++) {
                    if(arr[l].equals(k + "")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}