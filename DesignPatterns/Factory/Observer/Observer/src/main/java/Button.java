import java.util.ArrayList;
import java.util.List;

class Button {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void click() {
        System.out.println("Button clicked!");

        for (Observer observer : observers) {
            observer.update();
        }
    }
}
