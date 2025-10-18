package org.example.factorymethodlearn;

public class BasicCalculator implements CreditCalculator {
    @Override
    public double calculate(double amount) {
        return amount*2;
    }
}
