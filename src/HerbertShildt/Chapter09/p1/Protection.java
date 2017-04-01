package HerbertShildt.Chapter09.p1;

/**
 * Created by Oleg Kabysh on 01.04.2017.
 */
public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    public Protection() {
        System.out.println("It is the constructor base of class");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);

    }
}
