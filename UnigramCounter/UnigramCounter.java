package UnigramCounter;

import java.util.*;
import java.io.*;

public class UnigramCounter {
    public static void main(String[] args) {
        HashMap<String, Integer> count = new HashMap<>();
        Scanner inputStream = null;
        PrintWriter outStream = null;
        try {
            inputStream = new Scanner(new FileInputStream("ugraminput.txt"));
            outStream = new PrintWriter(new FileOutputStream("unnigramoutput.csv"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        while (inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            Scanner lineScan = new Scanner(line);

            while (lineScan.hasNext()) {
                String w = lineScan.next();
                String word = w.replaceAll("[^a-zA-Z0-9]", "");
                word = word.toLowerCase();
                if (!word.isEmpty()) {
                    count.put(word, count.getOrDefault(word, 0) + 1);
                }
            }

            lineScan.close();
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            outStream.println(entry.getKey() + "," + entry.getValue());
        }
        inputStream.close();
        outStream.close();
        System.out.println(count);
    }
}
