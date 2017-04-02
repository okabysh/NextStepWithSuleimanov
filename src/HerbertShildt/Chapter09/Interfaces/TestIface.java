package HerbertShildt.Chapter09.Interfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class TestIface {
    public static void main(String[] args) {
        Callback callback = new Client2();
        callback.callback(42);
    }
}
