package gr.aueb.cf.ch11;

/**
 * Driver class.
 */
public class Main {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        System.out.println(Student.getStudentsCount());

        // Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("WonderLand");

        // Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("Bob Id: " + bob.getId());
        System.out.println("Bob Firstname: " + bob.getFirstname());
        System.out.println("Bob Lastname: " + bob.getLastname());
    }
}
