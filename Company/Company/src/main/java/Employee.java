import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String firstName;
    public double salary;
    public int yearsOfExperience;
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
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setAge(int age) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public  String getPosition() {
        return null;
    }

    @Override
    public String toString(){
        return "Сотрудник  " + firstName + " Должность  " + getPosition() + salary + " Стаж работы " + yearsOfExperience;
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

