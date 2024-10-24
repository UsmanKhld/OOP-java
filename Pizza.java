import java.util.*;

public class Pizza {
    private String size;
    private int cheeseTop;
    private int pepTop;
    private int hamTop;

    Pizza(String size, int cheeseTop, int pepTop, int hamTop) {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepTop = pepTop;
        this.hamTop = hamTop;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCheeseTop(int cheeseTop) {
        this.cheeseTop = cheeseTop;
    }

    public void setPepTop(int pepTop) {
        this.pepTop = pepTop;
    }

    public void setHamTop(int hamTop) {
        this.hamTop = hamTop;
    }

    public double calcCost() {
        int cost = 0;
        if (size.equalsIgnoreCase("small")) {
            cost += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            cost += 12;
        } else if (size.equalsIgnoreCase("large")) {
            cost += 14;
        } else {
            System.out.println("INVALID SIZE");
        }
        float toppingsCost = 2 * hamTop + 2 * pepTop + 2 * cheeseTop;
        cost += toppingsCost;

        return cost;
    }

    public String getDiscription() {
        return "The size of the pizza is " + size + " with " + cheeseTop + " cheese toppings, " + pepTop
                + " pepperoni toppings, and " + hamTop + " ham toppings. The total cost is " + calcCost();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the pizza: ");
        String size = input.nextLine();

        System.out.println("Enter the amount of cheese toppings: ");
        int cheeseTop = input.nextInt();

        System.out.println("Enter the amount of pepperoni toppings: ");
        int pepTop = input.nextInt();

        System.out.println("Enter the amount of ham toppings: ");
        int hamTop = input.nextInt();

        Pizza pizza = new Pizza(size, cheeseTop, pepTop, hamTop);

        System.out.println(pizza.getDiscription());
    }
}
