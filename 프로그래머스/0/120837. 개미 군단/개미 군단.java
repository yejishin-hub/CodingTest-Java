class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ant1 = hp / 5;
        int ant2 = (hp - ant1 * 5) / 3;
        int ant3 = (hp - ant1 * 5 - ant2 * 3);
        answer = ant1 + ant2 + ant3;
        return answer;
    }
}