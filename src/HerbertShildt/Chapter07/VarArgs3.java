package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 27.03.2017.
 */
public class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.println("Number of arguments (int[]): " + v.length);
        for (int x : v) {
            System.out.print(x + " ");
        } System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("Number of arguments (boolean): " + v.length);
        for (boolean x : v) {
            System.out.print(x + " ");
        } System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println("Number of arguments (String + int[]): " + v.length);
        System.out.println("String: " + msg);
        for (int x : v) {
            System.out.print(x + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("It is the test!", 10, 20, 30);
        vaTest(true, false, false, true);
    }
}
