import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 1 ; i <= n ; i ++) {
            if(n % i == 0) result.add(i);
        }
        // 모든 약수의 수는 순서쌍의 수와 같음
        return result.size();
    }
}