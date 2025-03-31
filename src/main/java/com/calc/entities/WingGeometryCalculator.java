package com.calc.entities;

public class WingGeometryCalculator {

    private final double mass;       // масса m0
    private final double loadFactor; // p0 (питоме навантаження на крило)

    public WingGeometryCalculator(double mass, double loadFactor) {
        this.mass = mass;
        this.loadFactor = loadFactor;
    }

    public double calculateWingArea() {
        return mass / loadFactor;
    }

    public double calculateWingSpan(double S) {
        return 4.42 + 0.406 * S;
    }

    public double calculateAspectRatio(double span, double S) {
        return (span * span) / S;
    }

    public double calculateTaperRatio() {
        return 3.0; // допустимо взяти як константу
    }

    public double calculateRootChord(double S, double span, double eta) {
        return (2 * S) / (span * (1 + eta));
    }

    public double calculateTipChord(double b0, double eta) {
        return b0 / eta;
    }

    public void printAll() {
        double S = calculateWingArea();
        double span = calculateWingSpan(S);
        double aspectRatio = calculateAspectRatio(span, S);
        double eta = calculateTaperRatio();
        double b0 = calculateRootChord(S, span, eta);
        double bk = calculateTipChord(b0, eta);

        System.out.println("=== Wing Geometry ===");
        System.out.printf("Wing Area (S): %.2f m²\n", S);
        System.out.printf("Wing Span (l): %.2f m\n", span);
        System.out.printf("Aspect Ratio (λ): %.2f\n", aspectRatio);
        System.out.printf("Taper Ratio (η): %.2f\n", eta);
        System.out.printf("Root Chord (b₀): %.2f m\n", b0);
        System.out.printf("Tip Chord (bₖ): %.2f m\n", bk);
    }
}
