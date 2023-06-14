package gr.aueb.cf.ch7;

//Concatenates two or more strings. Συνενωση

public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String fullname;
        String titledFullname;


        fullname = firstname + lastname;

        titledFullname = title.concat(firstname.concat(lastname));
        System.out.println(titledFullname);
    }
}
