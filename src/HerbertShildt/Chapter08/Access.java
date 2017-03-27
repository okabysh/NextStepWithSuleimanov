package HerbertShildt.Chapter08;

/**
 * Created by Oleg Kabysh on 28.03.2017.
 */
public class Access {
    public static void main(String[] args) {
        B_2 subObj = new B_2();

        subObj.setij(10, 12);

        subObj.sum();
        System.out.println("Amount total = ");
    }
}
