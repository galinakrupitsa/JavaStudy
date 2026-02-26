public class Main {
    public static void main(String[] args)
    {
        ModernCar tesla = new Tesla();
        tesla.start();
    Gentra gentra = new Gentra();
    Adapter adapter = new Adapter(gentra);
    adapter.start();
    adapter.stop();
    }
}
