package Odometer;

public class TestOdometer {
    public static void main(String[] args) {
        System.out.println("For your fuel efficient car: ");
        Odometer fuelEfficientCar = new Odometer();
        fuelEfficientCar.setFuelIneff(50); // miles per gallon

        fuelEfficientCar.addMiles(100);
        System.out.printf("After 100 miles, %.2f gallons used.%n", fuelEfficientCar.getTotalGallons());

        fuelEfficientCar.addMiles(50);
        System.out.printf("After another 50 miles, %.2f gallons used.%n", fuelEfficientCar.getTotalGallons());

        System.out.println("");

        // ************************************
        System.out.println("For your gas guzzler car: ");
        Odometer gasGuzzler = new Odometer();
        gasGuzzler.setFuelIneff(10); // miles per gallon

        gasGuzzler.addMiles(100);
        System.out.printf("After 100 miles, %.2f gallons used.%n", gasGuzzler.getTotalGallons());

        gasGuzzler.addMiles(50);
        System.out.printf("After another 50 miles, %.2f gallons used.%n", gasGuzzler.getTotalGallons());
    }
}
