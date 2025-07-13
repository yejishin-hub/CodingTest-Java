class Solution {
    public int solution(String[] order) {
        int amount = 0;
        for(String str : order){
            if(str.contains("cafelatte")){
                amount += 5000;
            }else{
                amount += 4500;
            }
        }
        return amount;
    }
}