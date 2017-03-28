package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class Box3Weight extends Box3{
    double weight;

    Box3Weight(Box3Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Box3Weight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Box3Weight() {
        super();
        weight = -1;
    }

    Box3Weight(double len, double m) {
        super(len);
        weight = m;
    }
}
