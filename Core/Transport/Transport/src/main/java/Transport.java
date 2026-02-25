public abstract class Transport {
public String name;
public int maxSpeed;

    public Transport(String name, int maxSpeed) {
	this.name = name;
	this.maxSpeed = maxSpeed;
}
public String getName() {
    return name;
}
public int getMaxSpeed() {
    return maxSpeed;
}
public abstract void run();
public abstract int fuelConsumption(int km);
public abstract String typoOfTransport();
    @Override
    public String toString() {
        return typoOfTransport() + name +
                ", Макс. скорость: " + maxSpeed;
    }
}
