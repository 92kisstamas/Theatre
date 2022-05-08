package Theatre.ModifierClasses;

import Theatre.ThePlay;

public class Role {

    private String thePlay;
    private final String nameOfRole;
    private Roles roles1;
    private Roles roles2;
    private Roles roles3;

    public Role(String nameOfRole) {
        this.nameOfRole = nameOfRole;
    }

    public Role( String nameOfRole, ThePlay thePlay, Roles roles1) {
        this.thePlay = thePlay.getTITLE_OF_THE_PLAY();
        this.nameOfRole = nameOfRole;
        this.roles1 = roles1;
    }

    public Role(String nameOfRole, ThePlay thePlay,  Roles roles1, Roles roles2) {
        this.thePlay = thePlay.getTITLE_OF_THE_PLAY();
        this.nameOfRole = nameOfRole;
        this.roles1 = roles1;
        this.roles2 = roles2;
    }

    public Role( String nameOfRole, ThePlay thePlay, Roles roles1, Roles roles2, Roles roles3) {
        this.thePlay = thePlay.getTITLE_OF_THE_PLAY();
        this.nameOfRole = nameOfRole;
        this.roles1 = roles1;
        this.roles2 = roles2;
        this.roles3 = roles3;
    }

    public String getThePlay() {
        return thePlay;
    }

    public void setThePlay(String thePlay) {
        this.thePlay = thePlay;
    }

    public String getNameOfRole() {
        return nameOfRole;
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
}
