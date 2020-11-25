package learning.patterns.ptototype;

import java.util.Objects;

public abstract class Shape {
    int x;
     int y;
     String color;


    public Shape(){

    }

    public Shape(Shape original){
        this.x = original.x;
        this.y = original.y;
        this.color = original.color;

    }

public abstract Shape copy();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y &&
                Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
