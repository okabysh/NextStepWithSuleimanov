package HerbertShildt.Chapter09.Interfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class AnotherClient implements Callback {

    public void callback(int param) {
        System.out.println("Еще вариант реализации метода callback()");
        System.out.println("param в квадрате = " + (param*param));
    }
}
