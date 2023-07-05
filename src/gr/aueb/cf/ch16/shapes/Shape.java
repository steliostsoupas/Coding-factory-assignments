package gr.aueb.cf.ch16.shapes;

public abstract class Shape implements IShape {
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract double getArea();

    public abstract double getDiameter();
}
