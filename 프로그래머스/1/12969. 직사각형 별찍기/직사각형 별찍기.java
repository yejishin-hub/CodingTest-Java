import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n 가로
        int m = sc.nextInt(); // m 세로
        for(int i = 0; i < m; i++) {
            System.out.println("*".repeat(n));
        }
    }
}