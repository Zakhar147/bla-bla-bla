package com.calc.entities;

public class ServiceEquipment {
    private double serviceEquipmentMass;

    public ServiceEquipment(double aircraftMass) {
        this.serviceEquipmentMass = 0.05 * aircraftMass;
    }

    public double getMass() {
        return serviceEquipmentMass;
    }
}
