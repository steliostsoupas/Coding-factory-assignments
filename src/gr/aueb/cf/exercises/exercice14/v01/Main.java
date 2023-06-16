package gr.aueb.cf.exercises.exercice14.v01;

public class Main {

    public static void main(String[] args) {
        /**
         *   Retrieve the SaintGeorgeKnight instance
         */
        SaintGeorgeKnight knight = SaintGeorgeKnight.getInstance("Dan Stevens");

        /**
         *  Embark on a mission
         */
        knight.embrakOnMission();
    }
}
