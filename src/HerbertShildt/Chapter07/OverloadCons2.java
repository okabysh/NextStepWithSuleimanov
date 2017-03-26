package HerbertShildt.Chapter07;

import HerbertShildt.Chapter06.Box;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class OverloadCons2 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box cube = new Box(7);

        Box box = new Box(box1);

        System.out.println("Volume1 = " + box1.volume());
        System.out.println("Volume2 = " + box2.volume());
        System.out.println("Volume cube = " + cube.volume());
        System.out.println("Volume cube(clone) = " + box.volume());
    }
}
