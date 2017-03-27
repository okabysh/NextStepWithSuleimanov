package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 27.03.2017.
 */
public class SimpleInheritance {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();

        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Show object superObj:");
        superObj.showij();
        System.out.println();

        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Show object subObj:");
        subObj.showij();
        subObj.showk();

        System.out.println();
        System.out.println("Amount i,j and k");
        subObj.sum();
    }
}
