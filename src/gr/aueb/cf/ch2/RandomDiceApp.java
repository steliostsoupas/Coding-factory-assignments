package gr.aueb.cf.ch2;

public class RandomDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;
        int count = 0;


        while (die1 != 6 || die2 != 6) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            count++;
            System.out.printf("Die1; %d, Die2: %d\n", die1, die2);

        }
    }
}
