package HerbertShildt.Chapter09.InterfaceFixStack;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
interface IntStack {
    void push(int item);
    int pop();
    default void clear() {
        System.out.println("Method Clear not implement");
    }
}
