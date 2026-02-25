public class Car extends Transport {

    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void run() {
        System.out.println("машина едет");
    }


    public String typeOfTransport() {
        return "Машина ";
    }
    @Override
    public int fuelConsumption(int km) {
      return km*8;
    }

    @Override
    public String typoOfTransport() {
        return "Машина ";
    }

}
