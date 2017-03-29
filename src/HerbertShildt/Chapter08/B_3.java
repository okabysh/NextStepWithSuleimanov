package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 29.03.2017.
 */
public class B_3 extends A_3 {
    int i;

    B_3(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
