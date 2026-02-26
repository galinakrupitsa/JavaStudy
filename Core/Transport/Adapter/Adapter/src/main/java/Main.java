public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        Adapter adapter = new Adapter(oldSystem);
        adapter.pay(1000);
    }
}
