
public class Car {
    private String model;
    private String number;
    private boolean isParked;

    public Car(String model, String number) {
        this.model = model;
        this.number = number;
        this.isParked = false;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void parking(){
        this.isParked = true;
    }
    public void leaving(){
        this.isParked = false;
    }
    public boolean isParked() {
        return isParked;
    }
    @Override
    public String toString() {
        return "Машина: " + this.model + ", number: " + this.number + " на парковке ";
    }
}
