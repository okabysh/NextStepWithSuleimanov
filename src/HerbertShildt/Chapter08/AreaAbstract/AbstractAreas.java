package HerbertShildt.Chapter08.AreaAbstract;

/**
 * Created by kabysh_ol on 30.03.2017.
 */
public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figure;

        figure = rectangle;
        System.out.println(figure.area());

        figure = triangle;
        System.out.println(figure.area());
    }
}
