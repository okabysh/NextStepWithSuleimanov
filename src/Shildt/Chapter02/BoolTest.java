package Shildt.Chapter02;

/**
 * Created by Oleg Kabysh on 20.03.2017.
 */
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        if (b) System.out.println("Это true");
        b = false;
        if (b) System.out.println("Это false");

        System.out.println("10 > 9 равно " + (10>9));
    }
}
