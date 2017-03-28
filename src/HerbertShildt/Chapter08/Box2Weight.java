package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class Box2Weight extends Box2 {
    double weight;

    Box2Weight(double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
        super(w, h, d);
        weight = m;
    }
}
