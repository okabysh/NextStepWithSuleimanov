package Tasks.Task01.Tic_Tac_Toe;

import static Tasks.Task01.Tic_Tac_Toe.Engine.fieldArray;

/**
 * Created by kabysh_ol on 10.04.2017.
 */
public class Field {

    public void draw(String mode) {
        if (mode == "toConsole") {
            for (int i = 0; i < 15; i++)
                System.out.println();

            System.out.println(fieldArray[0] + " | " + fieldArray[1] + " | " + fieldArray[2]);
            System.out.println("---------");
            System.out.println(fieldArray[3] + " | " + fieldArray[4] + " | " + fieldArray[5]);
            System.out.println("---------");
            System.out.println(fieldArray[6] + " | " + fieldArray[7] + " | " + fieldArray[8]);
        }
    }

    public void draw() {
        System.out.println("Игровое поле состоит из полей от 0 до 8.");
        System.out.println("0" + " | " + "1" + " | " + "2");
        System.out.println("---------");
        System.out.println("3" + " | " + "4" + " | " + "5");
        System.out.println("---------");
        System.out.println("6" + " | " + "7" + " | " + "8");
        System.out.println();
    }
}
