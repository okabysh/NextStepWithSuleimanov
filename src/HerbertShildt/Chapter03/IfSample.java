package HerbertShildt.Chapter03;

/**
 * Created by Oleg Kabysh on 15.03.2017.
 */
public class IfSample {
    public static void main(String[] args) {
        int x,y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x*2;
        if (x == y) System.out.println("x теперь равно y");

        x = x*2;
        if (x > y) System.out.println("x теперь больше y");

        if (x == y) System.out.println("Вы не увидите этого!");
    }
}
