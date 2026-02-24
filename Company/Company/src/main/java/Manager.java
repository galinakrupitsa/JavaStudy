public class Manager extends Employee {
    private double bonus;
    public Manager(String firstName, double salary, int yearsOfExperience,  double bonus ) {
        super(firstName, salary, yearsOfExperience);
        this.bonus = bonus;
    }
    @Override
    public String getPosition() {
        return " Менеджер ";
    }
    public double calculateBonus() {
        if (yearsOfExperience>=3& yearsOfExperience<5){
            bonus = bonus*2;
        }
        if (yearsOfExperience>=5){
            bonus = bonus*3;
        }
        return bonus;
    }
    public double calculateSalary() {
        salary = salary + calculateBonus();
        return salary;
    }


}
