public class Cryptarithmetic {
    public static void main(String[] args) {
        for (int T = 0; T < 10; T++) {
            for (int O = 0; O < 10; O++) {
                if (T == O)
                    continue;
                for (int G = 0; G < 10; G++) {
                    if (G == T || G == O)
                        continue;
                    for (int D = 0; D < 10; D++) {
                        if (D == G || D == O || D == T)
                            continue;

                        int TOO = 100 * T + 11 * O;
                        int GOOD = 1000 * G + 110 * O + D;

                        if (4 * TOO == GOOD) {
                            System.out.println("Found solution");
                            System.out.println("T = " + T);
                            System.out.println("O = " + O);
                            System.out.println("G = " + G);
                            System.out.println("D = " + D);

                        }
                    }
                }
            }
        }
    }
}
