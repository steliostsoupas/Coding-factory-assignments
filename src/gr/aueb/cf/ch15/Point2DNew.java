package gr.aueb.cf.ch15;

/**
 * Composition & Forwarding
 * Wrapper & Decoration
 * Delegation Pattern.
 */
public class Point2DNew {
    // Composition - private instance
    private Point point;
    private int y;

    public Point2DNew(){}

    public Point2DNew(Point point, int y) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    // Forwarding
    public void movePLus10(){
        point.movePlus10();
        y += 10;
    }

    public void movePlus1(){
        point.movePlusOne();
        y += 1;
    }
}
