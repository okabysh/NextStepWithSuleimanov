package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class DemoBoxWeight {
    public static void main(String[] args) {
        Box2Weight box2Weight1 = new Box2Weight(10, 20, 15, 34.3);
        Box2Weight box2Weight2 = new Box2Weight(2, 3, 4, 0.076);
        double vol;

        vol = box2Weight1.volume();
        System.out.println("Value 1 = " + vol);
        System.out.println("Weight 1 = " + box2Weight1.weight);
        System.out.println();

        vol = box2Weight2.volume();
        System.out.println("Volume 2 = " + vol);
        System.out.println("Weight 2 = " + box2Weight2.weight);

    }
}
