package HerbertShildt.Chapter06;

/**
 * Created by Oleg Kabysh on 25.03.2017.
 */
public class Box {
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
//        System.out.print("Volume = ");
//        System.out.println(width * height * depth);
        return width * height * depth;
    }

}
