package HerbertShildt.Chapter09.p2;

import HerbertShildt.Chapter09.p1.Protection;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("It is constructor from other package");

        System.out.println("n_pro = " + p.n_pub);
    }
}
