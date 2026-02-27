public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(3);
        garage.addCar(new Car("BMW"));
        garage.addCar(new Car("Ford"));
        garage.addCar(new Car("BYD"));
        CarIterator iterator = garage.createIterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName());
        }
    }
}
