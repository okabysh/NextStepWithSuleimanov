package Tasks.Task01.Tic_Tac_Toe;

import static Tasks.Task01.Tic_Tac_Toe.Engine.*;

/**
 * Created by kabysh_ol on 10.04.2017.
 */
public class Lounch {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Field field = new Field();
        int result;

        System.out.println("Добро пожаловать в простую игру Крестики - нолики!");
        field.draw();

        while (winner == Player.NOBODY) {
            result = engine.nextMove();
            if (result == -1) {
                continue;
            } else {
                if (engine.checkMoveToField(result) == true) {
                    engine.setMove(result);
                } else {
                    continue;
                }
                engine.checkWhoIsWinner();
                if (winner != Player.NOBODY) {
                    break;
                }
            }
            field.draw("toConsole");
            // кто ходит следующий
            if (whoIsMove == Player.USER) {
                whoIsMove = Player.COMPUTER;
            } else if (whoIsMove == Player.COMPUTER) {
                whoIsMove = Player.USER;
            }
        }

        field.draw("toConsole");
        System.out.println();
        if (winner == Player.COMPUTER) {
            System.out.println("Computer выиграл!");
        } else if (winner == Player.USER) {
            System.out.println("Поздравляем!");
            System.out.println("Вы победитель!");
        }
    }
}
