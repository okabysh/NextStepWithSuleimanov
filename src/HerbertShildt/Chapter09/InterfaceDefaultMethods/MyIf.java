package HerbertShildt.Chapter09.InterfaceDefaultMethods;

/**
 * Created by Oleg Kabysh on 03.04.2017.
 */
public interface MyIf {
    int getNumber();

    default String getString() {
        return "It is Object type String default";
    }
}
