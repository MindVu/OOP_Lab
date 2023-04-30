import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of matrix: ");
        int n = sc.nextInt();
        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];
        int sum[][] = new int[n][n];

        System.out.println("Please enter first matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Please enter second matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = sc.nextInt();
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("Sum matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", sum[i][j]);
            }
            System.out.print("\n");
        }
    }
}
