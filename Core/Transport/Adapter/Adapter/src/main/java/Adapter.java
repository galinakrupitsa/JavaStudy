public class Adapter implements Payment {
public OldSystem oldSystem;
public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }
    @Override
    public void pay(double amount) {
        oldSystem.MakePayment(amount);
    }
}
