import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list) {
        int calc1 = IntStream.of(num_list).reduce(1, (a, b) -> a * b);
        int calc2 = (int)Math.pow(IntStream.of(num_list).sum(), 2);
        return calc1 < calc2 ? 1 : 0;
    }
}