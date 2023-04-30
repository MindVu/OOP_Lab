import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = kb.nextLine();
        System.out.print("How old are you: ");
        int age = kb.nextInt();
        System.out.print("How tall are you: ");
        double height = kb.nextDouble();

        System.out.println("Mr/Mrs " + name + "\nAge: " + age + "\nHeight: " + height + "(m)");
    }
}
