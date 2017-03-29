package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 30.03.2017.
 */
public class B_5 extends A_5 {
    int k;
    public B_5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k = " + k);
    }
 }
