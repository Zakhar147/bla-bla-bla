package com.calc.entities;

public class Fuel {
    private double fuelMass;

    public Fuel(double aircraftMass) {
        this.fuelMass = 0.15 * aircraftMass;
    }

    public double getMass() {
        return fuelMass;
    }
}