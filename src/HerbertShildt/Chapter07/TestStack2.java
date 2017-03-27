package HerbertShildt.Chapter07;

/**
 * Created by kabysh_ol on 27.03.2017.
 */
public class TestStack2 {
    public static void main(String[] args) {
        Stack2 stack1 = new Stack2(5);
        Stack2 stack2 = new Stack2(8);

        for (int i=0; i<5; i++) {
            stack1.push(i);
        }
        for (int i=0; i<8; i++) {
            stack2.push(i);
        }

        System.out.println("Stack 1:");
        for (int i=0; i<5; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println("Stack 2:");
        for (int i=0; i<8; i++) {
            System.out.println(stack2.pop());
        }
    }

}
