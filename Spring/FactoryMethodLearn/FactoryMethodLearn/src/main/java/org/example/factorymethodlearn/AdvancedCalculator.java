package org.example.factorymethodlearn;

public class AdvancedCalculator implements CreditCalculator {
    @Override
    public double calculate(double amount) {
        return amount * 10;
    }
}
