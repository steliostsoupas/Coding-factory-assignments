package gr.aueb.cf.ch4;

/** εκτυπωνει σε αυξουσα σειρα 10 αστερακια
 * 1,2,3
 */

public class Stars10Acs {

    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
