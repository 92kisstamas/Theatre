package Theatre;

import Theatre.ModifierClasses.Actor;
import Theatre.ModifierClasses.TheatreCompanyMember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TheatreCompany {

    private String nameOfTheCompany;
    private Actor[] theCompany;
    private TheatreCompanyMember[] theatreCompanyMembers;

    public TheatreCompany(String nameOfTheCompany, TheatreCompanyMember[] theatreCompanyMembers) {
        this.nameOfTheCompany = nameOfTheCompany;
        this.theatreCompanyMembers = theatreCompanyMembers;
        theCompany = setTheActors(theatreCompanyMembers);
    }

    private Actor[] setTheActors (TheatreCompanyMember[] theatreCompanyMembers) {
        ArrayList<Actor> temp = new ArrayList<>();
        int y = 0;
        for (int i = 0; i < theatreCompanyMembers.length; i++) {
            if (theatreCompanyMembers[i] instanceof Actor) {
                temp.add((Actor) theatreCompanyMembers[i]);
                y++;
            }
        }
        Actor[] actorsTemp = new Actor[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            actorsTemp[i] = temp.get(i);
        }
        return actorsTemp;
    }

    public TheatreCompanyMember[] getTheatreCompanyMembers() {
        return theatreCompanyMembers;
    }

    public void setTheatreCompanyMembers(TheatreCompanyMember[] theatreCompanyMembers) {
        this.theatreCompanyMembers = theatreCompanyMembers;
    }

    public String getNameOfTheCompany() {
        return nameOfTheCompany;
    }

    public void setNameOfTheCompany(String nameOfTheCompany) {
        this.nameOfTheCompany = nameOfTheCompany;
    }

    public Actor[] getTheCompany() {
        return theCompany;
    }

    public void setTheCompany(Actor[] theCompany) {
        this.theCompany = theCompany;
    }


    @Override
    public String toString() {
        return "A színtársulat {" +
                "Színtársulat neve: '" + nameOfTheCompany + '\'' +
                ", Színészek nevei: " + Arrays.toString(theCompany) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheatreCompany that = (TheatreCompany) o;
        return Objects.equals(nameOfTheCompany, that.nameOfTheCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheCompany);
    }
}
