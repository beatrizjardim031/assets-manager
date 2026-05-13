package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private double odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, double odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        double price = getOriginalCost();

        if (age >= 0 && age <= 3) {
            price = price - (price * 0.03 * age);
        } else if (age >= 4 && age <= 6) {
            price = price - (price * 0.06 * age);
        } else if (age >= 7 && age <= 10) {
            price = price - (price * 0.08 * age);
        } else if (age > 10) {
            price = 1000;
        }
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            price = price - (price * .25);
        }
        return price;
    }
}
