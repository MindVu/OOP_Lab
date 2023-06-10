package hust.soict.ict.lab01;
import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task;
        do {
            System.out.println("1. Solve the first-degree equation with one varible");
            System.out.println("2. Solve the system of first-degree equations with two variable");
            System.out.println("3. Solve the second-degree equation with one variable");
            System.out.println("0. Exit");
            System.out.print("Please choose by pressing the corresponding number: ");
            task = sc.nextInt();
            if (task == 1) {
                System.out.println("Please enter a and b: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                if (a == 0) {
                    System.out.println("The equation have no solution");
                } else {
                    System.out.println("The solution of equation: " + (-b / a));
                }
            } else if (task == 2) {
                System.out.println("Please enter the parameter of the first equation: ");
                double a11 = sc.nextDouble();
                double a12 = sc.nextDouble();
                double b1 = sc.nextDouble();
                System.out.println("Please enter the parameter of the second equation: ");
                double a21 = sc.nextDouble();
                double a22 = sc.nextDouble();
                double b2 = sc.nextDouble();
                double D = a11 * a22 - a21 * a12;
                double D1 = b1 * a22 - b2 * a12;
                double D2 = a11 * b2 - a21 * b1;
                if (D == 0) {
                    if (D2 == 0) {
                        System.out.println("This system equation has infinite solutions!");
                    } else {
                        System.out.println("This system equation has no solution!");
                    }
                } else {
                    System.out.println("The solution of this system equation: " + (D1 / D) + " and " + (D2 / D));
                }
            } else if (task == 3) {
                System.out.println("Please enter 3 parameters: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                while (a == 0) {
                    System.out.println("Invalid. Please enter again: ");
                    a = sc.nextDouble();
                }
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("The equation has no solution!");
                } else if (delta == 0) {
                    System.out.println("The equation has 1 solution: " + -b / (2 * a));
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (4 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (4 * a);
                    System.out.println("The equation has 2 solutions: " + x1 + " and " + x2);
                }

            } else {
                System.out.println("Program ended!");
            }
        } while (task != 0);
    }
}
