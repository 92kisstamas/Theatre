package Theatre.ModifierClasses;

public class TheatreCompanyMember {

    private final String NAME;
    private int age;
    private double salary;

    public TheatreCompanyMember(String NAME, int age, double salary) {
        this.NAME = NAME;
        this.age = age;
        this.salary = salary;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
