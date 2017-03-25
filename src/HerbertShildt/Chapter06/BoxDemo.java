package HerbertShildt.Chapter06;

/**
 * Created by Oleg Kabysh on 25.03.2017.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.weight = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.weight * mybox.height * mybox.depth;
        System.out.println("Volume = " + vol);
    }
}
