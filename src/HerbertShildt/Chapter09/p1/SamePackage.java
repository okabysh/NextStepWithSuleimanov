package HerbertShildt.Chapter09.p1;

/**
 * Created by Oleg Kabysh on 01.04.2017.
 */
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("It is the constractor SamePackage");
        System.out.println("p.n = " + p.n);

        //System.out.println("n_pri = " + n_pri);

        System.out.println("p.n_pro = " + p.n_pro);
        System.out.println("p.n_pub = " + p.n_pub);
    }
}
