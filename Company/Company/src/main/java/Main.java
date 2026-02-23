import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Den", 2000,4,1);
        Manager manager2 = new Manager("Ann", 3000,6,2);
        Developer dev1 = new Developer("Adele", 5000,5,"Spain");
        Developer dev2 = new Developer("Andy", 5000,5,"Italy");
        double b = dev2.calculateSalary();
        System.out.println(b);
    }
}
