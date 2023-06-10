package hust.soict.ict.lab01;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int i = n; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            System.out.print(" ");
            for(int j = 0; j < c; j++)
            System.out.print("*");
            System.out.print("\n");
            c+=2;
        }
    }
}
