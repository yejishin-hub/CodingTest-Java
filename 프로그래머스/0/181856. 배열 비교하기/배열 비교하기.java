import java.util.stream.IntStream;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            int arr1Sum = IntStream.of(arr1).sum();
            int arr2Sum = IntStream.of(arr2).sum();
            return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1); 
        }
    }
}