package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 27.03.2017.
 */
public class VarArgs {
    static void vaTest(int ... v) {
        System.out.println("Number of arguments: " + v.length);
        for (int x :
                v) {
            System.out.print(x + " ");

        } System.out.println();

    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
