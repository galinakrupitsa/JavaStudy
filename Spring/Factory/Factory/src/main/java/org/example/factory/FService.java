package org.example.factory;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class FService {
    private final Map<String, Function<Double, Double>> calculators = new HashMap<>();

    public FService() {
        calculators.put("basic", amount -> amount * 1.05);
        calculators.put("advanced", amount -> amount * 1.10);
    }
    public double calculate(DTO dto) {
        Function<Double, Double> calculator = calculators.get(dto.getType());

        if (calculator != null) {
            return calculator.apply((double) dto.getAmount());
        } else {
            throw new IllegalArgumentException("Неизвестный тип кредита: " + dto.getType());
        }
    }
}