package gr.aueb.cf.ch4;

//switch instead of if-the-else if.gets a users coise
//based on a menu and return a feedback

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:" +
                    "\n1. One-player game" +
                    "\n2. Two-player game" +
                    "\n3. Team game" +
                    "\n4. Quit" +
                    "\nPlease provide a choice ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one player game");
                    break;
                case 2:
                    System.out.println("Start two player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Quit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 4);

        System.out.println("Goodbye");
    }
}
