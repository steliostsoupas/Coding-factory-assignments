package gr.aueb.cf.exercises;

import java.io.*;
import java.util.Scanner;

public class exercise10 {

    public static void main(String[] args) {
        String line;
        String[] students;
        File dir = new File("C:/temp");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/temp/grades.txt"));
             FileWriter fw = new FileWriter("C:/temp/primOut.txt"); FileWriter log = new FileWriter("C:/temp/log.txt")) {

            while ((line = bf.readLine()) != null) {
                students = line.split(" ");

                if (students.length == 4) {
                    String firstname = students[0];
                    String lastname = students[1];
                    int num1 = Integer.parseInt(students[2]);
                    int num2 = Integer.parseInt(students[3]);
                    double average = (num1 + num2) / 2.0;

                    if ((num1 < 0 || num1 > 10) || (num2 < 0 || num2 > 10)) {
                        log.write(firstname + " " + lastname + " " + num1 + " " + num2);
                        log.write("\n");
                    } else {
                        fw.write(firstname + " " + lastname + " " + average);
                        fw.write("\n");

                    }

                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }

            System.out.println("Data written to primOut.txt successfully.");

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
