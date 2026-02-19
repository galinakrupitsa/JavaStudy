
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println(calculator.sumDayOfWeekTimes(a, b));


        scanner.close();
    }
}
