package HerbertShildt.Chapter08.AreaAbstract;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
