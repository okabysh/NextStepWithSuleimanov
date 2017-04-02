package HerbertShildt.Chapter09.Interfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class TestIfaceAnother {
    public static void main(String[] args) {
        Callback callback = new Client2();
        AnotherClient anotherClient = new AnotherClient();

        callback.callback(42);

        callback = anotherClient;
        callback.callback(42);
    }
}
