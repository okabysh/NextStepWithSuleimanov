package HerbertShildt.Chapter08.Example_6;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Rectangle area.");
        return dim1 * dim2;
    }
}
