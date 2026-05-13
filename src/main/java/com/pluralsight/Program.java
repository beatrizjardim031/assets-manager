package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Hobbit Hole / Smial", "April 12, 2841", 450.000, "Bag End, Underhill, Hobbiton", 1, 1250, 1575));
        assets.add(new House("The Golden Hall of Edoras", "May 12, 2026", 50478, "Edoras, Rohan", 4, 500, 12));
        assets.add(new Vehicle("Daily commuter with excellent fuel economy", "March 15, 2022", 24500, "Honda Civic EX", 2022, 12450.5));
        assets.add(new Vehicle("Off-road capable family SUV", "November 10, 2018", 24500, "Toyota 4Runner TRD Pro", 2018, 89200.7));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Actual Price: " + asset.getValue());
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("House at " + house.getAddress());
            }
            if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
        }
    }
}
