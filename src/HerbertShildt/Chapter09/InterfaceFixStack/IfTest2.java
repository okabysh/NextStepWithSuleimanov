package HerbertShildt.Chapter09.InterfaceFixStack;

import HerbertShildt.Chapter09.InterfaceFixStack.DynStack;

/**
 * Created by Oleg Kabysh on 02.04.2017.
 */
public class IfTest2 {
    public static void main(String[] args) {
        DynStack dynStack1 = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        for (int i=0; i<12; i++) {
            dynStack1.push(i);
        }
        for (int i=0; i<20; i++) {
            dynStack2.push(i);
        }

        System.out.println("Stack 1:");
        for (int i=0; i<12; i++) {
            System.out.println(dynStack1.pop());
        }

        System.out.println("Stack 2:");
        for (int i=0; i<20; i++) {
            System.out.println(dynStack2.pop());
        }
    }
}
