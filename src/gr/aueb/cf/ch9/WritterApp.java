package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WritterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/temp/test1.txt");
             PrintWriter pw = new PrintWriter("C:/temp/test1.txt")) {
            ps.println("Hello CF");
            pw.println("Hello CF");
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
