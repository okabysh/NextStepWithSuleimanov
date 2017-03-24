package HerbertShildt.Chapter05;

/**
 * Created by Oleg Kabysh on 25.03.2017.
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата");

        if (t) return;

        System.out.println("Не выполнится");
    }
}
