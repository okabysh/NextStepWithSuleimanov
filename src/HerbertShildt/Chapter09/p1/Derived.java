package HerbertShildt.Chapter09.p1;

/**
 * Created by Oleg Kabysh on 01.04.2017.
 */
public class Derived extends Protection {
    Derived() {
        System.out.println("It is the constructor of subclass");
        System.out.println("n = " + n);

        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
