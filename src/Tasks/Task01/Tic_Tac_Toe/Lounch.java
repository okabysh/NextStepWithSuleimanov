package Tasks.Task01.Tic_Tac_Toe;

import java.util.Random;

/**
 * Created by kabysh_ol on 10.04.2017.
 */
public class Lounch {
    public static void main(String[] args) {
        String[] fieldArray = new String[9];

        if ((fieldArray[0] == "Х" || fieldArray[0] == "O") &&
                (fieldArray[1] == "Х" || fieldArray[1] == "O") &&
                        (fieldArray[2] == "Х" || fieldArray[2] == "O")) {}

        for (String element :
                fieldArray) {
            //element;
        }
        Field field = new Field();

        field.update(fieldArray);

//
//        for (String itera:
//                field) {
//            System.out.println(itera);
//        }
//        Random random = new Random();
//        while (true) {
//            if (random.nextInt(9) == 8) {
//                System.out.println("OK");
//                break;
//            }
//        }
//        for (int i=0; i<50; i++) {
//            System.out.println(random.nextInt(9));
//        }

    }
}
