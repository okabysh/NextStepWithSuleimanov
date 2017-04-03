package HerbertShildt.Chapter09.InterfaceStaticMethods;

/**
 * Created by Oleg Kabysh on 03.04.2017.
 */
public interface MyIf {
    int getNumber();

    default String getString() {
        return "It is Object type String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
