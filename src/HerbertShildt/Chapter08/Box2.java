package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class Box2 {
    double width;
    double height;
    double depth;

    public Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box2(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }

    public Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

}
