package Theatre.ModifierClasses;

import java.util.Objects;

public class ActorRole {

    private Actor actor;
    private Role role;

    public ActorRole(Actor actor, Role role) {
        this.actor = actor;
        this.role = role;
    }

    public String getActor() {
        return actor.getNAME();
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getRole() {
        return role.getNameOfRole();
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role + " szerepében: " + actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorRole actorRole = (ActorRole) o;
        return Objects.equals(actor, actorRole.actor) && Objects.equals(role, actorRole.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, role);
    }
}
