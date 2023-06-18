package gr.aueb.cf.ch15;

public class Point {
    private int x;
    private double origin;

    public Point(){}

    public Point(int x) {
        this.x = x;
    }

    public Point(int x, double origin) {
        this.x = x;
        this.origin = origin;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

//    public String convertToString() {
//        return "(" + x + ")";
//    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    protected void movePlusOne() {
        x += 1;
    }



    public void movePlus10() {
        // x += 10;

        // self-use
        for (int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }

    private void reset() {
        x = 0;
    }

    public double getDistanceFromOrigin() {
        return x - origin;
    }
}
