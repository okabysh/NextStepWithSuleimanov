package HerbertShildt.Chapter07;

/**
 * Created by kabysh_ol on 27.03.2017.
 */
public class Stack2 {
    private int stck[];
    private int tos;

    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos==stck.length-1) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
