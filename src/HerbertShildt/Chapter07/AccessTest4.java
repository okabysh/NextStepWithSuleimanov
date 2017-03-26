package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class AccessTest4 {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

//        ob.c = 100;
        ob.setC(100);
        System.out.println("a, b and c = " + ob.a + ", " + ob.b + " and " + ob.getC());
    }
}
