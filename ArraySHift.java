import java.util.*;

public class ArraySHift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choice = "no";

        while (!(choice.equalsIgnoreCase("yes"))) {
            System.out.println("Enter a string: ");
            String word = input.nextLine();
            char arr[] = word.toCharArray();

            System.out.println("Enter shifts: ");
            int shifts = input.nextInt();

            for (int i = 0; i < shifts; i++) {
                char temp = arr[0];
                for (int j = 0; j < (arr.length - 1); j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }

            System.out.println(arr);

            input.nextLine();
            System.out.println("Would you like to quit? ");
            choice = input.nextLine();
        }

    }
}
