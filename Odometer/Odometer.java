package Odometer;

import java.util.*;

public class Odometer {

    private int milesDriven;
    private float fuelIneff;
    private float totalGallons;

    Odometer() {
        milesDriven = 0;
        fuelIneff = 0;
        totalGallons = 0;
    }

    public void reset() {
        milesDriven = 0;
        totalGallons = 0;
    }

    public void setFuelIneff(float fuelIneff) {
        this.fuelIneff = fuelIneff;
    }

    public void addMiles(int miles) {
        milesDriven += miles;
        totalGallons += miles / fuelIneff;
    }

    public float getTotalGallons() {
        return totalGallons;
    }

    public int getMilesDriver() {
        return milesDriven;
    }
}
