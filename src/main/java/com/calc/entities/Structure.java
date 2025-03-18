package com.calc.entities;

public class Structure {
    private double fuselageMass;
    private double wingMass;
    private double landingGearMass;
    private double controlSystemMass;

    public Structure(double aircraftMass) {
        this.fuselageMass = 0.25 * aircraftMass;
        this.wingMass = 0.18 * aircraftMass;
        this.landingGearMass = 0.07 * aircraftMass;
        this.controlSystemMass = 0.05 * aircraftMass;
    }

    public double getMass() {
        return fuselageMass + wingMass + landingGearMass + controlSystemMass;
    }
}

