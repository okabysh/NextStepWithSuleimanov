package HerbertShildt.Chapter08.AreaAbstract;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("It is Rectangle");
        return dim1 * dim2;
    }
}
