package Theatre;

import Theatre.ModifierClasses.*;

public class Main {
    public static void main(String[] args) {


        ThePlay theFirstPlay = new ThePlay("James RR Martin",
                "Csak MódJaval");

        String[] propNames = {
                "Botok",
                "Kardok",
                "Tüzifa"
        };


        TheatreCompanyMember[] firtThCoMembers = {
                new Actor("Első", 10, 150, ActingTalent.EXCEPTIONALLYGIFTED, Roles.CHILD),
                new Actor("Második", 20, 250, ActingTalent.VERYWEAK, Roles.YOUNG),
                new Actor("Harmadik", 25, 300, ActingTalent.WEAK, Roles.ADULT_WOMAN),
                new Director("Első Rendező", 33, 5000, 100, 2),
                new Props("ElsőKellékes", 23, 200, propNames),
                new Actor("Negyedik", 30, 350, ActingTalent.TALENTED, Roles.ADULT_MAN),
                new Actor("Ötödik", 35, 400, ActingTalent.AVERAGE, Roles.OLD)
        };

        Role[] roleArray = {
                new Role("Vadász", theFirstPlay, Roles.ADULT_MAN),
                new Role("Egerész", theFirstPlay, Roles.CHILD),
                new Role("Prostituált", theFirstPlay, Roles.ADULT_WOMAN),
                new Role("Rabló", theFirstPlay, Roles.YOUNG),
                new Role("Rendőr", theFirstPlay, Roles.OLD)
        };

        theFirstPlay.setCharacters(roleArray);
        theFirstPlay.setDifficultyLevel(DifficultyLevel.MEDIUM);
        theFirstPlay.setNumberOfActs(5);
        theFirstPlay.setGenre(Genre.COMEDY);

        TheatreCompany firstCompany = new TheatreCompany("Elsők", firtThCoMembers);

        Performance firstPerformance = new Performance(theFirstPlay, firstCompany);
        firstPerformance.preparations();

        firstPerformance.playSimulation(); //NULLPOINTER HIBA





        //---------------------------------    ELSŐ VERZIÓ   ---------------------------------

        /*
        String[] theCompany = {
            "Travis Fimmel",
            "Katheryn Winnick",
            "Jared Padalecki",
            "Jensen Ackles",
            "Jason Statham",
            "Angelina Jolie",
            "Jessica Alba",
            "Dobó Kata",
        };

        String[] characters = {
                "Ragnar",
                "Lagertha",
                "Sam Winchester",
                "Dean Winchester",
                "Shrek",
                "Süsü a sárkány",
                "Fiona",
                "Aranyhaj",
                "Hófehérke",
                "汁物"
        };

        TheatreCompany theFirstCompany = new TheatreCompany("aRandomok", theCompany);

        ThePlay theFirstPlay = new ThePlay("James RR Martin",
                "Csak MódJaval", 666, characters);

        Performance theFirstPerformance = new Performance(theFirstPlay, theFirstCompany);

        theFirstPerformance.castingOfARole();

        theFirstPerformance.playSimulation();
        */
        //--------------------------------------------------------------------------------------------


    }
}
