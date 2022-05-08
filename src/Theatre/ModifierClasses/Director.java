package Theatre.ModifierClasses;

import Theatre.ThePlay;
import Theatre.TheatreCompany;

import java.util.ArrayList;

public class Director extends TheatreCompanyMember{

    private int directingExperience;
    private int previousPlays;

    private ThePlay thePlay;
    private TheatreCompany theatreCompany;

    private ActorRole[] allRoles;

    public double directorRating(){
        return (double) directingExperience / previousPlays;
    }

    public void allRoles () {
        Role[] roleTemp = thePlay.getCharacters();
        Actor[] actorTemp = theatreCompany.getTheCompany();
        ArrayList<ActorRole> temp = new ArrayList<>();

        for (int i = 0; temp.size() == roleTemp.length; i++) {
            int y = 0;

            if (i >= actorTemp.length) {
                i = -1;
                continue;
            }

            if (roleTemp[y].getRole().equals(actorTemp[i].getRole())) {
                temp.add(new ActorRole(actorTemp[i], roleTemp[y]));
                y++;
            }
        }
        ActorRole[] tempOne = new ActorRole[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            tempOne[i] = temp.get(i);
        }
        allRoles = tempOne;
    }

    public ActorRole[] getAllRoles (){
        return allRoles;
    }

    public void setAllRoles (){
        allRoles();
    }

    public Director(String NAME, int age, double salary) {
        super(NAME, age, salary);
    }

    public Director(String NAME, int age, double salary, int directingExperience, int previousPlays) {
        super(NAME, age, salary);
        this.directingExperience = directingExperience;
        this.previousPlays = previousPlays;
        //allRoles();
    }

    public ThePlay getThePlay() {
        return thePlay;
    }

    public void setThePlay(ThePlay thePlay) {
        this.thePlay = thePlay;
    }

    public TheatreCompany getTheatreCompany() {
        return theatreCompany;
    }

    public void setTheatreCompany(TheatreCompany theatreCompany) {
        this.theatreCompany = theatreCompany;
    }

    public ActorRole[] getActorRoles() {
        return allRoles;
    }

    public int getDirectingExperience() {
        return directingExperience;
    }

    public void setDirectingExperience(int directingExperience) {
        this.directingExperience = directingExperience;
    }

    public int getPreviousPlays() {
        return previousPlays;
    }

    public void setPreviousPlays(int previousPlays) {
        this.previousPlays = previousPlays;
    }
}
