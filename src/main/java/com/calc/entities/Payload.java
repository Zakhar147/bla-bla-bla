package com.calc.entities;

public class Payload {
    private double cargoMass;
    private double crewMass;
    private double equipmentMass;

    public Payload(double aircraftMass) {
        this.cargoMass = 0.12 * aircraftMass;
        this.crewMass = 0.03 * aircraftMass;
        this.equipmentMass = 0.02 * aircraftMass;
    }

    public double getMass() {
        return cargoMass + crewMass + equipmentMass;
    }
}