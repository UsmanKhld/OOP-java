import java.util.Scanner;

public class IfState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        boolean isnum1 = true;
        while (isnum1) {
            System.out.print("Enter first number: ");
            try {
                num1 = input.nextInt();
                isnum1 = false;
            } catch (Exception e) {
                System.err.println("Invalid");
                input.next();
            }
        }

        boolean isnum2 = true;

        while (isnum2) {
            System.out.print("Enter second number: ");
            try {
                num2 = input.nextInt();
                isnum2 = false;
            } catch (Exception e) {
                System.err.println("Invalid");
                input.next();
            }
        }

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
