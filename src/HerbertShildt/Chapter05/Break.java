package HerbertShildt.Chapter05;

/**
 * Created by Oleg Kabysh on 24.03.2017.
 */
public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Предшедствует оператору Break");
                    if (t) break second;
                    System.out.println("Не выполняется");
                }
                System.out.println("Не выполняется");
            }
            System.out.println("First");
        }
    }

}
