package HerbertShildt.Chapter09.Interfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class Client implements Callback {

    public void callback(int param) {
        System.out.println("Method callback(), call with value " + param);
    }
}
