package gr.aueb.cf.ch7;

public class SubStringDemo {

    public static void main(String[] args) {
        String s = "Athens Uni of Economics and Bus";
        String substring = null;

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}
