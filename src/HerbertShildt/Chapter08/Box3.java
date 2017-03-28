package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class Box3 {
    private double width;
    private double height;
    private double depth;

    Box3(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box3(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
