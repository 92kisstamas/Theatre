package Theatre;

import Theatre.ModifierClasses.*;


public class Performance {

    private ThePlay thePlay;
    private TheatreCompany theatreCompany;
    private boolean successfulPerformance;
    private Director director;
    private ActorRole[] actorRoles;
    private Role[] roleTemp;
    private Actor[] actorTemp;

    public void playSimulation () {
        System.out.println(
                "A 'Most jön a java'...\nés a 'Javában írja már'\nnagyszerű szerzője " +
                        thePlay.getAUTHOR_OF_THE_PLAY() + " tollából...\n"
                        + "bemutatásra kerül a...\n\n\t" + thePlay.getTITLE_OF_THE_PLAY()
                        + "\n\nRendező: " + director.getNAME() + "\n");
        for (int i = 0; i < actorRoles.length; i++) {
            System.out.println(actorRoles[i].toString());
        }
    }

    public void preparations() {
        allRolesAssigned();
    }

    private Director setTheDirector () {
        Director directorTemp = null;
        TheatreCompanyMember[] theatreCompanies = theatreCompany.getTheatreCompanyMembers();
        for (TheatreCompanyMember company : theatreCompanies) {
            if (company instanceof Director) {
                directorTemp = (Director) company;
            }
        }
        return directorTemp;
    }

    private void allRolesAssigned () {
        director.getAllRoles();
    }



    public void setSuccessfulPerformance (boolean sucPer) {
        if (sucPer){
            director.setPreviousPlays(+1);
            switch (thePlay.getDifficultyLevel()){
                case EASY -> director.setDirectingExperience(director.getDirectingExperience()
                + 10);
                case MEDIUM -> director.setDirectingExperience(director.getDirectingExperience()
                        + 50);
                case DIFFICULT -> director.setDirectingExperience(director.getDirectingExperience()
                        + 100);
                default -> {break;}
            }
        } else {
            director.setPreviousPlays(+1);
        }
    }

    public Performance(ThePlay thePlay, TheatreCompany theatreCompany) {
        this.thePlay = thePlay;
        this.theatreCompany = theatreCompany;
        roleTemp = thePlay.getCharacters();
        actorTemp = theatreCompany.getTheCompany();
        director = setTheDirector();
        actorRoles = director.getAllRoles();
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
        return actorRoles;
    }
}