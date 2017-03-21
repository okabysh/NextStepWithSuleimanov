package HerbertShildt.Chapter03;

/**
 * Created by kabysh_ol on 21.03.2017.
 */
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y=" + y);

            y = 100;
            System.out.println("y теперь = " + y);
        }
    }
}
