package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class CallByValue {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int  a = 10, b = 20;
        System.out.println("Before: a and b " + a + " " + b);

        test2.meth(a, b);
        System.out.println("After: a and b " + a + " " + b);
    }
}
