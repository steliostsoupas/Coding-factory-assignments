package gr.aueb.cf.ch5;

/**
 *Ανταλλασσει αμοιβαια δυο τιμες που δινει ο χρηστης
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        swap(a, b);
        System.out.println("a = " + a + " b = " + b);
    }

    public static void swap(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}

