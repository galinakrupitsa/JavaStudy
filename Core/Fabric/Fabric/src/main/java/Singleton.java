public class Singleton {
    private static Singleton S1;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (S1 == null) {
            S1 = new Singleton();
        }
        return S1;
    }
    public void doSomething() {
        System.out.println("объект синглтон");
    }
}
