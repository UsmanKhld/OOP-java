import java.util.*;

public class LotterySim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int lotNum1 = rand.nextInt(99);
        int lotNum2 = rand.nextInt(99);
        int lotNum3 = rand.nextInt(99);
        int count = 1;

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();

        while (num1 < 0 || num1 > 99 || num2 < 0 || num2 > 99 || num3 < 0 || num3 > 99) {
            if (num1 < 0 || num1 > 99) {
                System.out.println(num1 + " is out of range");
            }
            if (num2 < 0 || num2 > 99) {
                System.out.println(num2 + " is out of range");
            }
            if (num3 < 0 || num3 > 99) {
                System.out.println(num3 + " is out of range");
            }

            System.out.print("Enter number 1: ");
            num1 = input.nextInt();

            System.out.print("Enter number 2: ");
            num2 = input.nextInt();

            System.out.print("Enter number 3: ");
            num3 = input.nextInt();
        }

        while (num1 != lotNum1 || num2 != lotNum2 || num3 != lotNum3) {
            lotNum1 = rand.nextInt(99);
            lotNum2 = rand.nextInt(99);
            lotNum3 = rand.nextInt(99);
            count++;
        }

        System.out.println("It took " + count + " iterations to get these 3 numbers " + lotNum1 + lotNum2 + lotNum3
                + " " + num1 + num2 + num3);

    }
}
