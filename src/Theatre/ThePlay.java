package Theatre;

import Theatre.ModifierClasses.DifficultyLevel;
import Theatre.ModifierClasses.Genre;
import Theatre.ModifierClasses.Role;

import java.util.Arrays;
import java.util.Objects;

public class ThePlay {

     private final String AUTHOR_OF_THE_PLAY;
     private final String TITLE_OF_THE_PLAY;
     private int numberOfActs;
     private Role[] characters;
     private DifficultyLevel difficultyLevel;
     private Genre genre;

    public ThePlay(String AUTHOR_OF_THE_PLAY, String TITLE_OF_THE_PLAY) {
        this.AUTHOR_OF_THE_PLAY = AUTHOR_OF_THE_PLAY;
        this.TITLE_OF_THE_PLAY = TITLE_OF_THE_PLAY;
    }

    public ThePlay(String AUTHOR_OF_THE_PLAY, String TITLE_OF_THE_PLAY,
                   int numberOfActs, Role[] characters) {
        this.AUTHOR_OF_THE_PLAY = AUTHOR_OF_THE_PLAY;
        this.TITLE_OF_THE_PLAY = TITLE_OF_THE_PLAY;
        this.numberOfActs = numberOfActs;
        this.characters = characters;
    }

    public ThePlay(String AUTHOR_OF_THE_PLAY, String TITLE_OF_THE_PLAY,
                   int numberOfActs, Role[] characters, DifficultyLevel difficultyLevel, Genre genre) {
        this.AUTHOR_OF_THE_PLAY = AUTHOR_OF_THE_PLAY;
        this.TITLE_OF_THE_PLAY = TITLE_OF_THE_PLAY;
        this.numberOfActs = numberOfActs;
        this.characters = characters;
        this.difficultyLevel = difficultyLevel;
        this.genre = genre;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAUTHOR_OF_THE_PLAY() {
        return AUTHOR_OF_THE_PLAY;
    }

    public String getTITLE_OF_THE_PLAY() {
        return TITLE_OF_THE_PLAY;
    }

    public int getNumberOfActs() {
        return numberOfActs;
    }

    public void setNumberOfActs(int numberOfActs) {
        this.numberOfActs = numberOfActs;
    }

    public Role[] getCharacters() {
        return characters;
    }

    public void setCharacters(Role[] characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Színdarab {" +
                "Szerző: '" + AUTHOR_OF_THE_PLAY + '\'' +
                ",\n Cím: '" + TITLE_OF_THE_PLAY + '\'' +
                ",\n Felvonások száma: " + numberOfActs +
                ",\n Karakterek: " + Arrays.toString(characters) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThePlay thePlay = (ThePlay) o;
        return numberOfActs == thePlay.numberOfActs && Objects.equals(AUTHOR_OF_THE_PLAY, thePlay.AUTHOR_OF_THE_PLAY) && Objects.equals(TITLE_OF_THE_PLAY, thePlay.TITLE_OF_THE_PLAY) && Arrays.equals(characters, thePlay.characters);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(AUTHOR_OF_THE_PLAY, TITLE_OF_THE_PLAY, numberOfActs);
        result = 31 * result + Arrays.hashCode(characters);
        return result;
    }
}
