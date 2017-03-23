package HerbertShildt.Chapter05;

/**
 * Created by Oleg Kabysh on 23.03.2017.
 */
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
