package HerbertShildt.Chapter09.Interfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class Client2 implements Callback {
    public void callback(int param) {
        System.out.println("Method callback(), call with value " + param);
    }

    void nonIfaceMeth() {
        System.out.println("the method nonIfaceMeth() without interface");
    }
}
