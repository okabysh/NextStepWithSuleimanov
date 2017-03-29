package HerbertShildt.Chapter08;

/**
 * Created by kabysh_ol on 28.03.2017.
 */
public class RefDemo {
    public static void main(String[] args) {
        Box2Weight boxWeight = new Box2Weight(3, 5, 7, 8.37);
        Box2 box = new Box2();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Volume of boxWeight = " + vol);
        System.out.println("Weight of boxWeight = " + boxWeight.weight);
        System.out.println();

        box = boxWeight;
        vol = boxWeight.volume();
        System.out.println("Volume Box = " + vol);
        //System.out.println(box.weight);
    }
}
