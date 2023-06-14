package gr.aueb.cf.ch16;

/**
 * Tightly coupled.
 */
public class SpeakingSchoolApp {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("White cat");
        ISpeakable blackDog = new Dog("Black Dog");

        // Wiring
        GenericSpeakingSchool catSchool = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(blackDog);
    }
}
