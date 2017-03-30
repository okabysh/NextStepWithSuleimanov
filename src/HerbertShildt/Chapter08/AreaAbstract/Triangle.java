package HerbertShildt.Chapter08.AreaAbstract;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
class Triangle extends Figure {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("It is the triangle");
        return dim1 * dim2 / 2;
    }
}
