package com.calc.entities;

public class PowerPlant {
    private double engineMass;
    private double fuelSystemMass;

    public PowerPlant(double aircraftMass) {
        this.engineMass = 0.22 * aircraftMass;
        this.fuelSystemMass = 0.06 * aircraftMass;
    }

    public double getMass() {
        return engineMass + fuelSystemMass;
    }
}