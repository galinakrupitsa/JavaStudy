import java.util.NoSuchElementException;

public class Garage {
    private Car[] cars;
    private int size = 0;
    public Garage(int capacity) {
        cars = new Car[capacity];
    }
    public void addCar(Car car) {
        cars[size++] = car;
    }
    public GarageIterator createIterator() {
        return new GarageIterator();
    }

    public class GarageIterator implements CarIterator {
        int index = 0;
        @Override
        public boolean hasNext(){
            return index<size;
        }

        @Override
        public Car next() {
            if(!hasNext()){
                throw new RuntimeException("Garage is empty");
            }
            return cars [index++];
        }
    }
}
