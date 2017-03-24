package HerbertShildt.Chapter05;

/**
 * Created by kabysh_ol on 24.03.2017.
 */
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x: nums) {
            System.out.println("x = " + x);
            sum += x;
        }
        System.out.println("Сумма = " + sum);
    }
}
