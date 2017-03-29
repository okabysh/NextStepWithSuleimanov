package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 29.03.2017.
 */
public class DemoShipment {
    public static void main(String[] args) {
        Shipment3 shipment3_1 = new Shipment3(10, 20, 15, 10, 3.41);
        Shipment3 shipment3_2 = new Shipment3(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment3_1.volume();
        System.out.println("Volume shipment 1 = " + vol);
        System.out.println("Weught shipment 1 = " + shipment3_1.weight);
        System.out.println("Cost shipment 1 = " + shipment3_1.cost);

        System.out.println();

        vol = shipment3_2.volume();
        System.out.println("Volume shipment 2 = " + vol);
        System.out.println("Weught shipment 2 = " + shipment3_2.weight);
        System.out.println("Cost shipment 2 = " + shipment3_2.cost);


    }
}
