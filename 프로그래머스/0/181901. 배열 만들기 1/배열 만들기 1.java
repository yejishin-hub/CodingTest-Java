import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(k, n).filter(e -> e % k == 0).toArray();
    }
}