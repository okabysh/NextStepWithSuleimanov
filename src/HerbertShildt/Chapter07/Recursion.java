package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial 3 = " + f.fact(3));
        System.out.println("Factorial 4 = " + f.fact(4));
        System.out.println("Factorial 5 = " + f.fact(5));
    }
}
