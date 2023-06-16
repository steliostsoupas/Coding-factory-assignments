package gr.aueb.cf.exercises.exercice14.v02;

/**
 * The User class represents a user with an ID, first name, and last name.
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Registers the user.
     * Add any user registration functionality here.
     */
    public void registerUser() {
        System.out.println("User is registered successfully");
    }

    /**
     * Retrieves the user's ID.
     *
     * @return the user's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the user's ID.
     *
     * @param id the user's ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the user's first name.
     *
     * @return the user's first name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the user's first name.
     *
     * @param firstname the user's first name to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Retrieves the user's last name.
     *
     * @return the user's last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the user's last name.
     *
     * @param lastname the user's last name to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Example usage of the User class.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        user.registerUser();
    }
}

