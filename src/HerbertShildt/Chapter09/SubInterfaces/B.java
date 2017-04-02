package HerbertShildt.Chapter09.SubInterfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
