public class FabricTest {
    public static void main(String[] args) {
        Machine m1 = Factory.createMachine(3);
        m1.move();
        Machine m2 = Factory.createMachine(4);
        m2.move();
        Machine m3 = Factory.createMachine(5);
        m3.move();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2); // true
        s1.doSomething();
        s2.doSomething();
    }
}