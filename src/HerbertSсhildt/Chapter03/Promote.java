package HerbertSсhildt.Chapter03;

/**
 * Created by kabysh_ol on 21.03.2017.
 */
public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println("\'c\' to int: " + (int) c);

        System.out.println("5.67f * 42 = " + (f*b)); // ok float*byte = float (byte promote to float)
        System.out.println("50_000 / 97 = " + (i/c)); // ok int/char = int (char promote to int)
        System.out.println(".1234 * 1024 = " + (d*s)); // ok double*int = double (int promote to double)

        float result1 = (f*b) + (i/c);
        System.out.println("(f*b) + (i/c) = " + result1); // ok float*byte = float ... int/char = int ... float + int = float

        double result2 = result1 - (d*s);
        System.out.println("(f*b) + (i/c) - (d*s) = " + result2); // i am not undestand :( float-(double*short) = float-double = double (promote to double)
        // я ожидаю 753,14 - 0,1234*1024 = 753,14 - 126,3616 = 626,7787 (float - double = double)
        // а Java выдает 626.7784146484375 (double)
        // откуда такой хвост? xxx.xxxx146484375
    }
}
