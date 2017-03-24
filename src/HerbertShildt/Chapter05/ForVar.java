package HerbertShildt.Chapter05;

/**
 * Created by kabysh_ol on 24.03.2017.
 */
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
