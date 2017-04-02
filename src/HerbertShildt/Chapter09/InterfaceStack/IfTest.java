package HerbertShildt.Chapter09.InterfaceStack;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class IfTest {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        for (int i=0; i<5; i++) {
            fixedStack1.push(i);
        }
        for (int i=0; i<8; i++) {
            fixedStack2.push(i);
        }

        for (int i=0; i<5; i++) {
            System.out.println(fixedStack1.pop());
        }
        for (int i=0; i<8; i++) {
            System.out.println(fixedStack2.pop());
        }
    }
}
