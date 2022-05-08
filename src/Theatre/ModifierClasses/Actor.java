package Theatre.ModifierClasses;

public class Actor extends TheatreCompanyMember{

    private ActingTalent actingTalent;
    private Roles role;

    public Actor(String NAME, int age, double salary, ActingTalent actingTalent, Roles role) {
        super(NAME, age, salary);
        this.actingTalent = actingTalent;
        this.role = role;
    }


    public ActingTalent getActingTalent() {
        return actingTalent;
    }

    public void setActingTalent(ActingTalent actingTalent) {
        this.actingTalent = actingTalent;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "NAME='" + super.getNAME() + '\'' +
                ", salary=" + super.getSalary() +
                ", roles=" + role +
                '}';
    }
}
