import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking parking = new Parking();
        parking.addCar(new Car("bmw", "123"));
        parking.addCar(new Car("audi", "456"));

        while (true) {

            System.out.println("\nВведите номер машины:");
            String num = scanner.nextLine();
            System.out.println("Введите действие (заехать/выехать/показать):");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("заехать")) {
                parking.parkingCar(num);
            } else if (action.equalsIgnoreCase("выехать")) {
                parking.leaveCar(num);
            } else if (action.equalsIgnoreCase("показать")) {
                parking.showCars();
            } else {
                System.out.println("Неизвестная команда.");
            }



        }
    }
}