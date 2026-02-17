public class Main {

    public static void main(String[] args) {

        Button button = new Button();

        button.addObserver(new Logger());
        button.addObserver(new Notifier());
        button.addObserver(new SayMeow());

        button.click();
    }
}
