package HerbertShildt.Chapter08.Example_6;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figuref;

        figuref = r;
        System.out.println("S =" + figuref.area());

        figuref = t;
        System.out.println("S =" + figuref.area());

        figuref = f;
        System.out.println("S =" + figuref.area());

    }
}
