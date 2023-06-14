package gr.aueb.cf.ch4;

/**
 * αεναο for loop
 */

public class SpecialForCaseApp {

    public static void main(String[] args) {
        int counter = 0;

        for (;;){
            System.out.print("forever ");
            counter++;
            if (counter % 8 == 0) System.out.println();
            if (counter == 104) break;
        }
    }
}
