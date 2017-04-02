package HerbertShildt.Chapter09.SubInterfaces;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nestedIf = new B();

        if (nestedIf.isNotNegative(10))
            System.out.println("10 неотрицательное");
        if (nestedIf.isNotNegative(-12))
            System.out.println("Это не будет выведено");

    }
}
