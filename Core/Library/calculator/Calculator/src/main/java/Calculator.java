import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calculator {
    private double a;
    private double b;

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b==0)
        {System.out.println("Ошибка: Деление на ноль!");
            return 0;
        }
        return a / b;
    }
    public double sumIfEven(double a, double b) {
        if (a % 2 == 0 & b % 2 == 0) {
            System.out.println("Сумма чисел, если они четные = ");
            return a + b;
        } else {
            System.out.println(" Числа нечетные, а мы складываем только четные, идите нафиг ");
            return 0;
        }
    }
    public static int getDayOfWeekNumber() {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        int dayNumber = dayOfWeek.getValue();
//        System.out.println("Сегодня день недели номер " + dayNumber);
        return dayNumber;
    }
    public double multiplayOnDayOfWeek(double a, double b) {
System.out.println("Сумма этих чисел, умноженная на день недели = ");
        return a*b*Calculator.getDayOfWeekNumber();
    }
    public double sumDayOfWeekTimes(double a, double b) {
return  a+b*Calculator.getDayOfWeekNumber();

    }
}
