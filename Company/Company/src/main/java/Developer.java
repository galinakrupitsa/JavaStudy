import java.text.DecimalFormat;

public class Developer extends Employee {
    private String vocation;
    public Developer(String firstName, double salary, int yearsOfExperience) {
        super(firstName, salary, yearsOfExperience);
    }
@Override
public String getPosition() {
        return " Разработчик ";
}
    public double calculateSalary() {
        salary = salary*1.5;
        return salary;
}
public void getVocation(String vocation) {

}
}
