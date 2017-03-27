package HerbertShildt.Chapter07;

/**
 * Created by kabysh_ol on 27.03.2017.
 */
public class Outer {
    int outex_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("outer_x = " + outex_x);
        }
    }
}
