package com.calc;


import com.calc.entities.WingGeometryCalculator;
import com.calc.models.Aircraft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aircraftMass = 0;

        while (true) {
            try {
                System.out.print("Enter the aircraft mass (kg): ");
                aircraftMass = Double.parseDouble(scanner.nextLine());
                if (aircraftMass <= 0) {
                    throw new IllegalArgumentException("Mass must be a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();

        Aircraft aircraft = new Aircraft(aircraftMass);
        System.out.println("\nComponent Masses:");
        aircraft.displayComponentMasses();
        System.out.println("Total Aircraft Mass: " + aircraft.calculateTotalMass() + " kg");

        double loadFactor = 750; // кг/м²
        WingGeometryCalculator wingCalc = new WingGeometryCalculator(aircraftMass, loadFactor);
        wingCalc.printAll();
    }
}