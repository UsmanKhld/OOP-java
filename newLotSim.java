import java.util.*;

public class newLotSim {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner input = new Scanner(System.in);

        int r1 = rand.nextInt(99);
        int r2 = rand.nextInt(99);
        int r3 = rand.nextInt(99);

        System.out.println("What are your three lottery numbers: ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        while (n1 > 99 || n1 < 0 || n2 > 99 || n2 < 0 || n3 > 99 || n3 < 0) {
            if (n1 > 99 || n1 < 0) {
                System.out.println(n1 + " is out of range");
            }
            if (n2 > 99 || n2 < 0) {
                System.out.println(n2 + " is out of range");
            }
            if (n3 > 99 || n3 < 0) {
                System.out.println(n3 + " is out of range");
            }
            System.out.println("What are your three lottery numbers: ");

            n1 = input.nextInt();
            n2 = input.nextInt();
            n3 = input.nextInt();
        }

        int count = 0;
        while (n1 != r1 || n2 != r2 || n3 != r3) {
            count++;
            r1 = rand.nextInt(99);
            r2 = rand.nextInt(99);
            r3 = rand.nextInt(99);
        }
        System.out.println("it took " + count + " to get " + r1 + " " + r2 + " " + r3);
    }
}
