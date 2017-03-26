package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class PassObjRe {
    public static void main(String[] args) {
        Test2 test2 = new Test2(15, 20);
        System.out.println("Before: a and b " + test2.i + " " + test2.j);

        test2.meth(test2);
        System.out.println("After: a and b " + test2.i + " " + test2.j);
    }
}
