import java.util.HashMap;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> dbMap = new HashMap<>();
        for(int i = 0; i < db.length; i++) {
            dbMap.put(db[i][0], db[i][1]); // key:ID, value:PW
        }
        
        if(dbMap.containsKey(id_pw[0])) {
            if(id_pw[1].equals(dbMap.get(id_pw[0]))){
                return "login";
            } else {
                return "wrong pw";
            }
        }
        return "fail";
    }
}