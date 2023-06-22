package gr.aueb.cf.ch17.callback;

/**
 * A demonstration class for the Knight interface and callback functionality.
 */
public class KnightApp {

    public static void main(String[] args) {
        IKnight kingArthur = new Knight();
        IKnight saitGeorge = new Knight();

        // Lambda Expressions
//        kingArthur.embarkOnMission(() -> System.out.println("Save the princess"));
//        saitGeorge.embarkOnMission(() -> killTheDragon());

        // Method References
        kingArthur.embarkOnMission(KnightApp::killTheDragon);
        saitGeorge.embarkOnMission(KnightApp::saveThePrincess);


    }

    public static void killTheDragon() {
        System.out.println("Kill the Dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the Princess");
    }
}
