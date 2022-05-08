package Theatre.ModifierClasses;

import java.util.Objects;

public class Actor extends TheatreCompanyMember{

    private ActingTalent actingTalent;
    private Roles roles1;
    private Roles roles2;
    private Roles roles3;

    public Actor(String NAME, int age, double salary) {
        super(NAME, age, salary);
    }

    public Actor(String NAME, int age, double salary, ActingTalent actingTalent) {
        super(NAME, age, salary);
        this.actingTalent = actingTalent;
    }

    public Actor(String NAME, int age, double salary, ActingTalent actingTalent, Roles roles1) {
        super(NAME, age, salary);
        this.actingTalent = actingTalent;
        this.roles1 = roles1;
    }

    public Actor(String NAME, int age, double salary, ActingTalent actingTalent, Roles roles1, Roles roles2) {
        super(NAME, age, salary);
        this.actingTalent = actingTalent;
        this.roles1 = roles1;
        this.roles2 = roles2;
    }

    public Actor(String NAME, int age, double salary, ActingTalent actingTalent, Roles roles1, Roles roles2, Roles roles3) {
        super(NAME, age, salary);
        this.actingTalent = actingTalent;
        this.roles1 = roles1;
        this.roles2 = roles2;
        this.roles3 = roles3;
    }

    public ActingTalent getActingTalent() {
        return actingTalent;
    }

    public void setActingTalent(ActingTalent actingTalent) {
        this.actingTalent = actingTalent;
    }

    public Roles getRoles1() {
        return roles1;
    }

    public void setRoles1(Roles roles1) {
        this.roles1 = roles1;
    }

    public Roles getRoles2() {
        return roles2;
    }

    public void setRoles2(Roles roles2) {
        this.roles2 = roles2;
    }

    public Roles getRoles3() {
        return roles3;
    }

    public void setRoles3(Roles roles3) {
        this.roles3 = roles3;
    }



    @Override
    public String toString() {
        return "Actor{" +
                "NAME='" + super.getNAME() + '\'' +
                ", salary=" + super.getSalary() +
                ", roles=" + roles1 +
                '}';
    }
}
