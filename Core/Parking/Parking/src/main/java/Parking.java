import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parking {
    List<Car> carList = new ArrayList<>();

    public Car addCar(Car car) {
        carList.add(car);
        return car;
    }
    public Car findCar(String number){
        for (Car car : carList) {
            if (Objects.equals(car.getNumber(), number))
                return car;
    }
        return null;
}
public void parkingCar(String number){
        Car car = findCar(number);
        if (car != null) {
            System.out.println("Машина не найдена");
        }
        if(car.isParked()){System.out.println(" Машина уже на парковке");}
        else {car.parking();
        System.out.println("Машина "+ car.getNumber()+" заехала на парковку");}
}
public void leaveCar(String number){
        Car car = findCar(number);
        if (car != null) {
        System.out.println("Машина не найдена");
    }
        if (!car.isParked()){System.out.println("Машина покинула парковку ");}
        else {car.leaving();
        System.out.println("Машина " + car.getNumber() + " выехала с парковки");}
}
public void showCars(){
        for (Car car : carList) {
            System.out.println(car);
        }
}
}
