import java.util.*;

public class ArrayListExercise {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                list.get(i).add(rand.nextInt(100));

                if (list.get(i).get(j) % 2 == 0) {
                    even.add(list.get(i).get(j));
                } else {
                    odd.add(list.get(i).get(j));
                }
            }
        }

        System.out.println(list);
        System.out.println(even);
        System.out.println(odd);

    }
}
