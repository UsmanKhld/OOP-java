import java.util.*;

public class Search2DAL {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> data1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            data1.add(new ArrayList<>(Arrays.asList(1, 1, 3, 1, 5)));
        }

        ArrayList<ArrayList<Integer>> data2 = new ArrayList<>();

        data2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        data2.add(new ArrayList<>(Arrays.asList(-2, -1, 2, 1)));
        data2.add(new ArrayList<>(Arrays.asList()));
        data2.add(new ArrayList<>(Arrays.asList(2, 2, 2)));

        System.out.println(data1);
        System.out.println(data2);
        DisplayLocations(SearchEven(data1));
        DisplayLocations(SearchEven(data2));

    }

    public static ArrayList<Integer> SearchEven(ArrayList<ArrayList<Integer>> data) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).size(); j++) {
                if (data.get(i).get(j) % 2 == 0) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }

    public static void DisplayLocations(ArrayList<Integer> list) {
        if (list.get(0) == -1) {
            System.out.println("This arraylist did not have any even numbers.");
        } else {
            for (int i = 0; i < list.size() - 1; i += 2) {
                System.out.println(list.get(i) + " " + list.get(i + 1));
            }
        }
    }
}
