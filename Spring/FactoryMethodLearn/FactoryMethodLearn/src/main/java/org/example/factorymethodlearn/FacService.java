package org.example.factorymethodlearn;

import org.springframework.stereotype.Service;

@Service
public class FacService {
    public int sayHello(DTO dto) {
        CreditCalculator calculator = CalculatorFactory.getCalculator(dto.getType());

        if (calculator == null) {
            System.out.println("Неверный тип кредита");
            return 0;
        }

        // вызываем метод расчёта
        return (int) calculator.calculate(dto.getAmount());
    }
}
