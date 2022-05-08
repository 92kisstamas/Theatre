package Theatre.ModifierClasses;

public class Props extends TheatreCompanyMember{

    private String[] propNames;

    public Props(String NAME, int age, double salary) {
        super(NAME, age, salary);
    }

    public Props(String NAME, int age, double salary, String[] propNames) {
        super(NAME, age, salary);
        this.propNames = propNames;
    }

    public String[] getPropNames() {
        return propNames;
    }

    public void setPropNames(String[] propNames) {
        this.propNames = propNames;
    }
}
