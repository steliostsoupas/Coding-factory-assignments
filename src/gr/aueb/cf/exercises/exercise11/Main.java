package gr.aueb.cf.exercises.exercice11;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Stelios", "Tsoupas");
        UserCredentials credentials = new UserCredentials(1, "stiltsoupas", "pass123");

        System.out.println("User fields: {" + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");
        System.out.println("UserCredentials fields: {" + credentials.getId() + ", " + credentials.getUsername() + ", " + credentials.getPassword() + "}");

    }
}
