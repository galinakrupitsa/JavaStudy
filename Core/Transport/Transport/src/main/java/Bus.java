public class Bus extends Transport{
    public Bus(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }

    @Override
    public int fuelConsumption(int km) {
        return km*15;
    }

    @Override
    public String typoOfTransport() {
        return "Автобус ";
    }


}
