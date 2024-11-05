import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Crypto {

    private String plaintext_filename;
    private String ciphertext_filename;
    private int key;

    Crypto(String plaintext_filename, String ciphertext_filename, int key) {
        this.plaintext_filename = plaintext_filename;
        this.ciphertext_filename = ciphertext_filename;
        this.key = key;
    }

    public void encrypt() {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new Scanner(new FileInputStream(plaintext_filename));
            outputStream = new PrintWriter(new FileOutputStream(ciphertext_filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (inputStream.hasNextLine()) {
            String word = inputStream.nextLine();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int ascii = (int) c;
                int new_ascii = ascii + key;
                outputStream.print(new_ascii);
                outputStream.print(" ");
            }
            outputStream.println(); // move to next line (new line)

        }

        inputStream.close();
        outputStream.close();
    }

    // not working yet
    public void decrypt() {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new Scanner(new FileInputStream(ciphertext_filename));
            outputStream = new PrintWriter(new FileOutputStream("input2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            Scanner lineScanner = new Scanner(line);

            while (lineScanner.hasNextInt()) {
                int ascii = lineScanner.nextInt();
                int new_ascii = ascii - key;
                char c = (char) new_ascii;
                outputStream.print(c);
            }
            outputStream.println();
            lineScanner.close();
        }

        inputStream.close();
        outputStream.close();
    }

    public static void main(String[] args) {
        Crypto c = new Crypto("input.txt", "output.txt", 3);
        c.encrypt();
        c.decrypt();
    }
}