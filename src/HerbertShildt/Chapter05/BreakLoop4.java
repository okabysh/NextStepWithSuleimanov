package HerbertShildt.Chapter05;

/**
 * Created by Oleg Kabysh on 24.03.2017.
 */
public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for (int i=0; i<3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {
                if (j == 10) break outer;
                System.out.print(j + " ");
            }
        }
    }
}