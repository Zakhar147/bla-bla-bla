package com.calc.entities;

public class ControlSystems {
    private double avionicsMass;
    private double electricalMass;
    private double hydraulicMass;

    public ControlSystems(double aircraftMass) {
        this.avionicsMass = 0.08 * aircraftMass;
        this.electricalMass = 0.045 * aircraftMass;
        this.hydraulicMass = 0.035 * aircraftMass;
    }

    public double getMass() {
        return avionicsMass + electricalMass + hydraulicMass;
    }
}