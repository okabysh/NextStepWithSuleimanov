package HerbertShildt.Chapter08.Example_6;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
public class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Triangle area.");
        return dim1 * dim2 / 2;
    }
}
