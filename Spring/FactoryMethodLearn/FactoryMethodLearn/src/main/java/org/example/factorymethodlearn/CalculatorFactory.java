package org.example.factorymethodlearn;

public class CalculatorFactory {
    public static CreditCalculator getCalculator(String type) {
        switch (type) {
            case "basic":
                return new BasicCalculator();

            case "advanced":
                return new AdvancedCalculator();

            default:
                System.out.println("Invalid type");
                return null;
        }
    }
}

