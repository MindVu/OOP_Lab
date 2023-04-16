import java.util.Scanner;

public class TwoNumbersOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        Double b = sc.nextDouble();

        System.out.println("The sum of two numbers: " + (a + b));
        System.out.println("The difference of two numbers: " + Math.abs(a - b));
        System.out.println("The quotient of two numbers: " + (a / b));
    }
}
