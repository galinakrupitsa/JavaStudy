import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportTools {
    Transport transport;
    List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public List<Transport> getTransports() {
        return transports;
    }

    @Override
    public String toString() {
        return "Название " + transports.toString();
    }

    public void printTransports() {
        for (Transport t : transports) {
            System.out.println(t);
        }
    }

    public Transport getTransportByName(String name) {
        for (Transport t : transports) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Transport getMaxSpeedTransport() {
        Transport max = transports.get(0);
        if (transports.isEmpty()) {
            return null;
        } else {
            for (Transport t : transports) {
                if (t.getMaxSpeed() > max.getMaxSpeed()) {
                    max = t;
                }
            }
            return max;
        }
    }


    public Map<String, Integer> getfuelConsumption() {
        Map<String, Integer> fuel = new HashMap<>();
        for (Transport t : transports) {
            fuel.put(t.getName(), t.fuelConsumption(100));
        }
    return fuel;
    }

    public Map<String, Double> calculateTravelTime(double km) {
        Map<String, Double> travelTime = new HashMap<>();
        for (Transport t : transports) {
            travelTime.put(t.getName(), km/(t.getMaxSpeed()));
        }
        return  travelTime;
    }
}