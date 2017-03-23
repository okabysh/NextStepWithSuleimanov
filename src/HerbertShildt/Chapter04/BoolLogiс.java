package HerbertShildt.Chapter04;

/**
 * Created by Oleg Kabysh on 23.03.2017.
 */
public class BoolLogiс {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=a|b;
        boolean d=a&b;
        boolean e=a^b;
        boolean f=(!a&b)|(a&!b);
        boolean g=!a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a|b = " + c);
        System.out.println("a&b = " + d);
        System.out.println("a^b = " + e);
        System.out.println("(!a&b)|(a&!b) = " + f);
        System.out.println("!a = " + g);
    }
}
