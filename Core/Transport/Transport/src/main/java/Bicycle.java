public class Bicycle extends Transport {
    public Bicycle(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void run() {
        System.out.println("Bicycle is running");
    }

    @Override
    public int fuelConsumption(int km) {
        return 0;
    }

    @Override
    public String typoOfTransport() {
        return "Велосипед ";
    }

}
