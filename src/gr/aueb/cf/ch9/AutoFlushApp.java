package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/temp/fos.txt"), true, StandardCharsets.UTF_8)) {
            ps.println("Hello!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
