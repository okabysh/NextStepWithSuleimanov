package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 27.03.2017.
 */
public class PassArray {
    static void vaTest(int v[]) {
        System.out.println("Number of arguments: " + v.length);
        for (int x :
                v) {
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
