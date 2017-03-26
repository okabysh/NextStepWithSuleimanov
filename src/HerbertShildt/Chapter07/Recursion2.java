package HerbertShildt.Chapter07;

/**
 * Created by Oleg Kabysh on 26.03.2017.
 */
public class Recursion2 {
    public static void main(String[] args) {
        RecTest recTest = new RecTest(10);
        int i;

        for (i=0; i<10; i++) {
            recTest.values[i] = i;
            recTest.printArray(10);
        }
    }
}
