package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int)(Math.random() *6) + 1;

        for (int i=1;i<2;i++)
            System.out.println(die);
        for (int i=1;i<2;i++)
            System.out.println(die);
        for (int i=1;i<2;i++)
            System.out.println(die);
    }
}
