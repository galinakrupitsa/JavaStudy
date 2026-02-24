import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void showAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
public void showAllSalaries() {
        for (Employee employee : employees) {
            System.out.println( employee.getPosition() +" " + employee.getFirstName()+ " " + employee.getSalary());
        }
}
public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(name)) {
                return employee;
            }
        }System.out.println(" Нет такого сотрудника");
        return null;
}
public Employee findMaxSalary() {
    if (employees.isEmpty()) {
        return null;
    }
    Employee maxSalary = employees.get(0);
    for (Employee employee : employees) {
        if (employee.getSalary() > maxSalary.getSalary()) {
            maxSalary = employee;
        }
    }
    return maxSalary;
}
    public Employee findMaxYearsOfExperience() {
        if (employees.isEmpty()) {
            return null;
        }
        else { Employee maxYearsOfExperience = employees.get(0);
            for (Employee employee : employees) {
                if (employee.getYearsOfExperience() > maxYearsOfExperience.getYearsOfExperience()) {
                    maxYearsOfExperience = employee;
                }
            }
            return maxYearsOfExperience;
        }

    }

}
