package HerbertShildt.Chapter08.DynamicManager;

/**
 * Created by Oleg Kabysh on 30.03.2017.
 */
public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
