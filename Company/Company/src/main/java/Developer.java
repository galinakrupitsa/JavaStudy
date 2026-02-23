public class Developer extends Employee {
    private String vocation;
    public Developer(String firstName, double salary, int yearsOfExperience, String vocation) {
        super(firstName, salary, yearsOfExperience);
        this.vocation = vocation;
    }

}
