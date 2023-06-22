package gr.aueb.cf.ch17.runnable;

/**
 * Represents a knight who can embark on missions.
 * <p>
 * This class implements the {@link IKnight} and {@link Runnable} interfaces.
 * It can embark on missions and can be executed as a separate thread.
 * </p>
 */
public class Knight implements IKnight, Runnable {

    private static final IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new RescueTheCaptiveMission()
    };

    private String name;

    public Knight() {}

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void embarkOnMission(IMission mission) {
        System.out.print(name + ": ");
        mission.embark();
        mission.setStatus(MissionStatus.STARTED);
    }

    @Override
    public void run() {
        synchronized (missions) {
            // critical section
            for (IMission mission : missions) {
                if (mission.getStatus() == MissionStatus.NON_STARTED) {
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }
}
