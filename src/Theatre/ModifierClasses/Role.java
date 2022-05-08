package Theatre.ModifierClasses;

import Theatre.ThePlay;

public class Role {

    private ThePlay thePlay;
    private final String nameOfRole;
    private Roles role;

    public Role(String nameOfRole) {
        this.nameOfRole = nameOfRole;
    }

    public Role(String nameOfRole, ThePlay thePlay, Roles role) {
        this.thePlay = thePlay;
        this.nameOfRole = nameOfRole;
        this.role = role;
    }

    public ThePlay getThePlay() {
        return thePlay;
    }

    public void setThePlay(ThePlay thePlay) {
        this.thePlay = thePlay;
    }

    public String getNameOfRole() {
        return nameOfRole;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}

