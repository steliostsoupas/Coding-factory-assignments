package gr.aueb.cf.ch4;

//diavazei enan char me tin System.in.read()

import java.io.IOException;

public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char inputChar = ' ';

        System.out.println("Please insert an ASCII char");
        inputChar = (char) System.in.read();

        System.out.println("Char: " + inputChar);
    }
}
