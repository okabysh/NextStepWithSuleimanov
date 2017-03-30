package HerbertShildt.Chapter08.Example_6;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
public class Figure {
    double dim1;
    double dim2;

    public Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("The area is not defined");
        return 0;
    }
}
