package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
