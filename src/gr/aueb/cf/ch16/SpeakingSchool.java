package gr.aueb.cf.ch16;

public class SpeakingSchool {
    private Cat cat = new Cat();

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void learnToSPeak() {
        cat.speak();
    }
}
