package hust.soict.ict.lab01;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        String months1[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        String months2[] = { "", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String months3[] = { "", "Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.",
                "Dec." };
        String months4[] = { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        Scanner sc = new Scanner(System.in);
        int month = 0, year = 0;
        boolean checkMonth = true, checkYear = true;
        
        while (checkMonth) {
            System.out.print("Please enter month: ");
            String iMonth = sc.nextLine();
            boolean check = false;
            for (int i = 1; i <= 12; i++) {
                if (iMonth.equals(months1[i]) || iMonth.equals(months2[i]) || iMonth.equals(months3[i])
                        || iMonth.equals(months4[i])) {
                    checkMonth = false;
                    check = true;
                    month = i;
                    break;
                }
            }
            if (!check) {
                System.out.println("Invalid!");
            }
        }
        while (checkYear) {
            System.out.print("Please enter year: ");
            year = sc.nextInt();
            if (year <= 0) {
                System.out.println("Invalid!");
            } else {
                checkYear = false;
            }
        }

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("29 days");
                } else
                    System.out.println("28 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("30 days");
                break;
        }
    }
}