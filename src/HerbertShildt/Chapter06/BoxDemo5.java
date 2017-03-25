package HerbertShildt.Chapter06;

/**
 * Created by Oleg Kabysh on 25.03.2017.
 */
public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        System.out.println("Volume1 = " + mybox1.volume());
        System.out.println("Volume2 = " + mybox2.volume());
    }
}
