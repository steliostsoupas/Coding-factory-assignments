package gr.aueb.cf.exercises.exercice14;

/**
 * The SaintGeorgeKnight class represents a knight who embarks on missions.
 * It is implemented as a Singleton class, ensuring that only one instance of the class exists.
 */
public class SaintGeorgeKnight {

    /**
     * Property for the singleton instance of the class
     */
    private static SaintGeorgeKnight instance;

    /**
     * Properties of class.
     */
    private String name;
    private int missionCount;

    /**
     * Private constructor for the SaintGeorgeKnight class.
     *
     * @param name the name of the knight
     */
    public SaintGeorgeKnight(String name) {
        this.name = name;
        this.missionCount = 0;
    }

    /**
     * Retrieves the singleton instance of the SaintGeorgeKnight class.
     * If the instance does not exist, it creates a new one.
     *
     * @param name the name of the knight
     * @return the singleton instance of SaintGeorgeKnight
     */
    public static SaintGeorgeKnight getInstance(String name) {
        if (instance == null) {
            instance = new SaintGeorgeKnight(name);
        }
        return instance;
    }

    /**
     * Embarks on a mission, incrementing the mission count for the knight.
     * Prints the knight's name and the current mission count.
     */
    public void embrakOnMission() {
        missionCount++;
        System.out.println(name + " is embarking on a mission. Mission count: " + missionCount);
    }
}
