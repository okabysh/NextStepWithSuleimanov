package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 29.03.2017.
 */
public class Shipment3 extends Box3Weight {
    double cost;

    Shipment3(Shipment3 ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment3(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment3() {
        super();
        cost = -1;
    }

    Shipment3(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
