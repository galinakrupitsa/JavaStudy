
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        Calculator calculator = new Calculator();
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double result = calculator.multiplayOnDayOfWeek(a, b);
        System.out.println(result);
        list.add(result);
        double result1 = calculator.sumDayOfWeekTimes(a,b);
        System.out.println(result1);
        list.add(result1);

        System.out.println("\nВсе результаты:");
        for (double res : list) {
            System.out.println(res);
        }

        scanner.close();
    }
}
