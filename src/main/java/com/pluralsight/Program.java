package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Hobbit Hole / Smial", "April 12, 2841", 450.000, "Bag End, Underhill, Hobbiton", 1, 1250, 1575));
        assets.add(new House("The Golden Hall of Edoras", "May 12, 2026", 50478, "Edoras, Rohan", 4, 500, 12));
        assets.add(new Vehicle("Daily commuter with excellent fuel economy", "March 15, 2022", 24500, "Honda Civic EX", 2022, 12450.5));
        assets.add(new Vehicle("Off-road capable family SUV", "November 10, 2018", 24500, "Toyota 4Runner TRD Pro", 2018, 89200.7));

        Cash cash = new Cash("Emergency Fund: ", "2024-01-01", 500.00);
        System.out.print(cash.getDescription());
        System.out.println(cash.getValue());

        for (Asset asset : assets) {
            System.out.printf("Description: %s%n", asset.getDescription());
            System.out.printf("Date Acquired: %s%n", asset.getDateAcquired());
            System.out.printf("Original Cost: %.2f%n", asset.getOriginalCost());
            System.out.printf("Actual Price: %.2f%n", asset.getValue());
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.printf("House at %s%n%n",house.getAddress());
            }

            if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.printf("Vehicle: %d | %s", vehicle.getYear(), vehicle.getMakeModel());
            }
        }
    }
}
