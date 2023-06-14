package gr.aueb.cf.ch4;

import java.util.Scanner;

/** ο χρηστης εχει 10 ευκαιριες για να
 * βρει ενα μυστικο αριθμο-κλειδι.αν το
 * βρει νωριτερα απο την 10η προσπαθεια
 * η for θα πρεπει να σταματησει.
 */

public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int SECRET_KEY = 1;
        int num = 0;
        int counter = 0,counter1 = 0,counter2 = 0,counter3 = 0,counter4 = 0,counter5 = 0,counter6 = 0;

        for  (int i = 1;i <= 6000000; i++) {
            SECRET_KEY = (int) (Math.random() * 6) + 1;
            num = SECRET_KEY;
            counter++;

            if (num == 1 ) counter1++;
            if (num == 2 ) counter2++;
            if (num == 3 ) counter3++;
            if (num == 4 ) counter4++;
            if (num == 5 ) counter5++;
            if (num == 6 ) counter6++;

            if (counter > 60){
                System.out.printf("counter 1: %d\ncounter 2: %d\ncounter 3: %d\ncounter 4: %d\ncounter 5: %d\ncounter 6: %d\n",counter1,counter2,counter3,counter4,counter5,counter6);
                break;
            }
        }


    }
}
