package Tasks.Task01.Tic_Tac_Toe;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Oleg Kabysh on 11.04.2017.
 */
public class Engine {
    public static String[] fieldArray = {" "," "," "," "," "," "," "," "," "};
    public static Player winner = Player.NOBODY;
    public static Player whoIsMove = Player.USER;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int result;

    public Integer nextMove() {
        // следующий ход игрока
        if (whoIsMove == Player.USER) {
            System.out.println("Введите номер поля(0-8), чтобы сделать свой ход: ");
            result = scanner.nextInt();
            if (result >= 0 && result <= 8) {
                return result;
            } else {
                System.out.println("Номер поля введен не верно!");
                return -1;
            }
        } else if (whoIsMove == Player.COMPUTER) {
            result = random.nextInt(9);
            return result;
        }
        return -1;
    }

    public void checkWhoIsWinner() {
        // определим есть ли выиграшная комбинация; если да, тогда кто выиграл
        if ((fieldArray[0] == "X" && fieldArray[1] == "X" && fieldArray[2] == "X") ||
           (fieldArray[3] == "X" && fieldArray[4] == "X" && fieldArray[5] == "X") ||
           (fieldArray[6] == "X" && fieldArray[7] == "X" && fieldArray[8] == "X") ||
           (fieldArray[0] == "X" && fieldArray[3] == "X" && fieldArray[6] == "X") ||
           (fieldArray[1] == "X" && fieldArray[4] == "X" && fieldArray[7] == "X") ||
           (fieldArray[2] == "X" && fieldArray[5] == "X" && fieldArray[8] == "X") ||
           (fieldArray[0] == "X" && fieldArray[4] == "X" && fieldArray[8] == "X") ||
           (fieldArray[2] == "X" && fieldArray[4] == "X" && fieldArray[6] == "X")) {
            winner = Player.USER;

        } else if ((fieldArray[0] == "O" && fieldArray[1] == "O" && fieldArray[2] == "O") ||
           (fieldArray[3] == "O" && fieldArray[4] == "O" && fieldArray[5] == "O") ||
           (fieldArray[6] == "O" && fieldArray[7] == "O" && fieldArray[8] == "O") ||
           (fieldArray[0] == "O" && fieldArray[3] == "O" && fieldArray[6] == "O") ||
           (fieldArray[1] == "O" && fieldArray[4] == "O" && fieldArray[7] == "O") ||
           (fieldArray[2] == "O" && fieldArray[5] == "O" && fieldArray[8] == "O") ||
           (fieldArray[0] == "O" && fieldArray[4] == "O" && fieldArray[8] == "O") ||
           (fieldArray[2] == "O" && fieldArray[4] == "O" && fieldArray[6] == "O")) {
            winner = Player.COMPUTER;
        }
    }

    public boolean checkMoveToField(int toField) {
        // проверем, можем ли походить на выбранное поле
        if (fieldArray[toField] == " ") {
            return true;
        } else {
            return false;
        }
    }

    public void setMove(int toField) {
        // установим ход игрока
        if (whoIsMove == Player.USER) {
            fieldArray[toField] = "X";
        } else {
            fieldArray[toField] = "O";
        }
    }
}
