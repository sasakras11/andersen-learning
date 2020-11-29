package learning.patterns.behavioral.visitor;

public class Circle extends Dot{

private int radius;


    public int getRadius() {
        return radius;
    }

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
