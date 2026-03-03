public class Main {
    public static void main(String[] args) {
        RestoranFactory factory = new JapaniseRestorantFactory();
        RestoranService service = new RestoranService(factory);
        service.makeDinner();
    }
}
