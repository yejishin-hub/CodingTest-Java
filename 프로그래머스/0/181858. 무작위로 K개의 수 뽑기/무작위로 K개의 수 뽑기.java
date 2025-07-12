import java.util.ArrayDeque;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            if(!arrayDeque.contains(arr[i])){
                arrayDeque.add(arr[i]);
            }
            if(arrayDeque.size() == k) {
                break;
            }
        }
        
        if(arrayDeque.size() < k) {
            for(int i = arrayDeque.size(); i < k; i++){
                arrayDeque.add(-1);
            }
        }
        return arrayDeque.stream().mapToInt(i -> i).toArray();
    }
}