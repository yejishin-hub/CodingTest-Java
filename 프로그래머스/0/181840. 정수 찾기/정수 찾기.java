import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list, int n) {
        return IntStream.of(num_list).anyMatch(e -> e == n) ? 1 : 0;
    }
}