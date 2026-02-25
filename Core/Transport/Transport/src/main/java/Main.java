import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TransportTools tools = new TransportTools();
        tools.addTransport(new Car("bmw",220));
        tools.addTransport(new Car("audi",250));
        tools.addTransport(new Bicycle("bmx",60));
        tools.addTransport(new Bus("Mersedes",50));
        tools.printTransports();
        System.out.println(tools.getTransportByName("bmw"));
        System.out.println("Максимальная скорость :" + tools.getMaxSpeedTransport());
        System.out.println(tools.getfuelConsumption());
        System.out.println(tools.calculateTravelTime(200));
    }
}
