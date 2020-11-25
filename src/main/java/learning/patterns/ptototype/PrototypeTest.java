package learning.patterns.ptototype;

public class PrototypeTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(20);
        rectangle.setWidth(20);
        rectangle.x = 10;
        rectangle.y = 20;
        rectangle.color = "red";

        Rectangle copy = rectangle.copy();

        System.out.println(rectangle);
        System.out.println(copy);
    }
}
