import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Company company = new Company();
    company.addEmployee(new Manager("Den", 2000,4,1));
    company.addEmployee(new Manager("Ann", 3000,6,2));
    company.addEmployee(new Developer("Adele", 5000,5));
    company.addEmployee(new Developer("Andy", 10000,7));

//    company.showAllSalaries();
    Employee employee = company.findEmployeeByName("Ann");
    double d = employee.calculateSalary();
    System.out.println(d);
    Employee employee2 = company.findEmployeeByName("Den");
    int s = employee2.getYearsOfExperience();
    System.out.println(s);
        Employee max = company.findMaxSalary();
        System.out.println("Сотрудник с максимальной зп: "+ max.getFirstName());
        Employee maxYears = company.findMaxYearsOfExperience();
        System.out.println("Самый большой стаж: " + maxYears.getFirstName());
System.out.println(company.mapOfSalary());
    }


}
