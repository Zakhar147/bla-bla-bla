package com.calc.models;

import com.calc.entities.*;

public class Aircraft {
    private Structure structure;
    private PowerPlant powerPlant;
    private ControlSystems controlSystems;
    private Payload payload;
    private Fuel fuel;
    private ServiceEquipment serviceEquipment;

    public Aircraft(double aircraftMass) {
        this.structure = new Structure(aircraftMass);
        this.powerPlant = new PowerPlant(aircraftMass);
        this.controlSystems = new ControlSystems(aircraftMass);
        this.payload = new Payload(aircraftMass);
        this.fuel = new Fuel(aircraftMass);
        this.serviceEquipment = new ServiceEquipment(aircraftMass);
    }

    public double calculateTotalMass() {
        return structure.getMass() + powerPlant.getMass() + controlSystems.getMass() + payload.getMass() + fuel.getMass() + serviceEquipment.getMass();
    }

    public void displayComponentMasses() {
        System.out.println("Structure Mass: " + structure.getMass() + " kg");
        System.out.println("Power Plant Mass: " + powerPlant.getMass() + " kg");
        System.out.println("Control Systems Mass: " + controlSystems.getMass() + " kg");
        System.out.println("Payload Mass: " + payload.getMass() + " kg");
        System.out.println("Fuel Mass: " + fuel.getMass() + " kg");
        System.out.println("Service Equipment Mass: " + serviceEquipment.getMass() + " kg");
    }
}