import java.util.Scanner;
class Solution {
    public void pattern22(int N) {
        for (int i = 1; i <= N; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // Create an instance of Solution class
        Solution sol = new Solution();
        
        sol.pattern22(N);
        sc.close();
    }

}
