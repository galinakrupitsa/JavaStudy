import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstName;
    private double salary;
    int yearsOfExperience;
    public Employee(String firstName, double salary, int yearsOfExperience) {
        this.firstName = firstName;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return yearsOfExperience;
    }
    public void setAge(int age) {
        this.yearsOfExperience = yearsOfExperience;
    }
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
   public double calculateSalary() {

       if (yearsOfExperience < 3) {
           salary = salary * 1.5;
       }
       if (yearsOfExperience >= 3 & yearsOfExperience < 5) {
           salary = salary * 1.1;
       }
       if (yearsOfExperience >= 5) {
           salary = salary * 1.2;
       }
       return salary;
   }
}

